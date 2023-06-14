package ro.Twitter_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.Twitter_app.mapper.PostMapper;
import ro.Twitter_app.model.DTO.PostDTO;
import ro.Twitter_app.model.DTO.ReplyDTO;
import ro.Twitter_app.model.Like;
import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.Reply;
import ro.Twitter_app.model.User;
import ro.Twitter_app.repository.LikeRepository;
import ro.Twitter_app.repository.PostRepository;
import ro.Twitter_app.repository.ReplyRepository;
import ro.Twitter_app.repository.UserRepository;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService{
    private final PostRepository postRepository;
    private final PostMapper postMapper;
    private final UserRepository userRepository;
    private final LikeRepository likeRepository;
    private final ReplyRepository replyRepository;
    @Autowired
    public PostServiceImpl(PostRepository postRepository, PostMapper postMapper, UserRepository userRepository, LikeRepository likeRepository, ReplyRepository replyRepository) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
        this.userRepository = userRepository;
        this.likeRepository = likeRepository;
        this.replyRepository = replyRepository;
    }

    public void createPost(Long userid, String message)
    {
        Post post=new Post();
        post.setUser(userRepository.findById(userid).get());
        post.setPostmessage(message);
        post.setDate(LocalDate.now());
        userRepository.findById(userid).get().getPosts().add(post);
        postRepository.save(post);
    }

    public List<PostDTO> getOwnPosts(Long userid, LocalDate timestamp)
    {
        return userRepository.findById(userid).get().getPosts().stream()
                .filter(x->x.getDate().isAfter(timestamp))
                .map(postMapper::postToPostDTO)
                .collect(Collectors.toList());
    }

    public List<PostDTO> getFeed(Long userid)
    {
        Iterator<User> it= userRepository.findById(userid).get().getFollowing().iterator();
        List<PostDTO> posts=new ArrayList<PostDTO>();
        while(it.hasNext())
        {
            User u=it.next();
            posts.addAll(u.getPosts().stream()
                    .map(postMapper::postToPostDTO)
                    .collect(Collectors.toList()));
        }
        return posts;
    }

    public void likePost(Long postid, Long userid)
    {
        Like like=new Like();
        if(postRepository.findById(postid).get().getLikes().stream()
                .filter(x->x.getUser().getUserid().equals(userid))
                .findFirst()
                .orElse(null)!=null)
            return;
        like.setPost(postRepository.findById(postid).get());
        like.setUser(userRepository.findById(userid).get());
        postRepository.findById(postid).get().getLikes().add(like);
        likeRepository.save(like);
    }

    public void replyToAPost(ReplyDTO replyDTO)
    {
        Reply reply=new Reply();
        reply.setPost(postRepository.findById(replyDTO.getPostid()).get());
        reply.setUser(userRepository.findUserByUsername(replyDTO.getUsername()).get());
        reply.setReplymessage(replyDTO.getMessage());
        reply.setReplyid(replyDTO.getReplyid());
        postRepository.findById(replyDTO.getPostid()).get().getReplies().add(reply);
        replyRepository.save(reply);
    }
}
