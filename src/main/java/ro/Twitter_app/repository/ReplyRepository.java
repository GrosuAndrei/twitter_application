package ro.Twitter_app.repository;

import org.springframework.stereotype.Repository;
import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.Reply;
import ro.Twitter_app.model.User;

@Repository
public class ReplyRepository {
    private User currentUser;
    private Post currentPost;

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public void setCurrentPost(Post currentPost) {
        this.currentPost = currentPost;
    }

    Reply reply=new Reply();

    public void reply_to_a_post(String message)
    {
        Post post= currentPost;
        reply.setId(currentUser.getId());
        post.replyedPost(reply);
        reply.setMessage(message);
    }
}
