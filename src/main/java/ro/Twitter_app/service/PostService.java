package ro.Twitter_app.service;

import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.User;

import java.util.List;

public interface PostService {
    public void createNewPost(Post post);
    public List<Post> getOwnPosts();
    public List<Post> getFeed();
    public void selectPost(Post post);

    public void setCurrentUser(User currentUser);

    public Post getCurrentPost();
}
