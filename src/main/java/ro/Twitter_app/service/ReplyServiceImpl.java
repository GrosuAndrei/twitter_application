package ro.Twitter_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.User;
import ro.Twitter_app.repository.ReplyRepository;

@Service
public class ReplyServiceImpl {
    private final ReplyRepository replyRepository;
    @Autowired
    public ReplyServiceImpl(ReplyRepository replyRepository)
    {
        this.replyRepository=replyRepository;
    }
    public void reply_to_a_post(String message)
    {
        replyRepository.reply_to_a_post(message);
    }
    public void setCurrentPost(Post currentPost)
    {
        replyRepository.setCurrentPost(currentPost);
    }
    public void setCurrentUser(User currentUser)
    {
        replyRepository.setCurrentUser(currentUser);
    }
}
