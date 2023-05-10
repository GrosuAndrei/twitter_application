package ro.Twitter_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.User;
import ro.Twitter_app.repository.PostRepository;

import java.util.List;

@Service
public class PostServiceImpl {
    private final PostRepository postRepository;
    @Autowired
    public PostServiceImpl(PostRepository postRepository)
    {
        this.postRepository=postRepository;
    }

    public void createNewPost(Post post)
    {
        postRepository.createPost(post);
    }

    public List<Post> getOwnPosts()
    {
        return postRepository.getOwnListOfPosts();
    }

    public List<Post> getFeed()
    {
        return postRepository.getFeed();
    }
    public void selectPost(Post post)
    {
        postRepository.selectPost(post);
    }

    public void setCurrentUser(User currentUser)
    {
        postRepository.setCurrentUser(currentUser);
    }
    public Post getCurrentPost()
    {
        return postRepository.getCurrentPost();
    }
}
