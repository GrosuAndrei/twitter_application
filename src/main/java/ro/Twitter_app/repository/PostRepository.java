package ro.Twitter_app.repository;

import org.springframework.stereotype.Repository;
import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class PostRepository {
    private User currentUser;

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    private Map<Integer, Post> POSTS= new HashMap<>();
    private Post currentPost=new Post();
    public List<Post> getAllPosts() {
        return POSTS.values().stream().collect(Collectors.toList());
    }
    public void createPost(Post post) {
            post.setUserId(currentUser.getId());
            POSTS.put(currentUser.getId(), post);
    }
    public List<Post> getOwnListOfPosts()
    {
        return getAllPosts().stream()
                .filter(x->x.getUserId()==currentUser.getId())
                .collect(Collectors.toList());
    }

    public List<Post> getFeed()
    {
        List<Integer> idList =currentUser.getFollowing().stream()
                .map(x->x.getId())
                .collect(Collectors.toList());
        return getAllPosts().stream()
                .filter(x->idList.contains(x.getUserId()))
                .collect(Collectors.toList());
    }
    public void selectPost(Post post)
    {
        if(getAllPosts().stream()
                .filter(x->x.getMessage().equals(post.getMessage()))
                .findFirst()
                .orElse(null)!=null)
        currentPost=post;
    }
    public Post getCurrentPost()
    {
        return currentPost;
    }
}
