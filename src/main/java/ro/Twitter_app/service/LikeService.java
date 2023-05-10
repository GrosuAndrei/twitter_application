package ro.Twitter_app.service;


import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.User;

public interface LikeService {
    public void likePost();
    public void setCurrentUser(User currntUser);
    public void setCurrentPost(Post currentPost);
}
