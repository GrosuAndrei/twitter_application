package ro.Twitter_app.service;

import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.User;

public interface ReplyService {
    public void reply_to_a_post(String message);
    public void setCurrentUser(User currentUser);
    public void setCurrentPost(Post currentPost);
}
