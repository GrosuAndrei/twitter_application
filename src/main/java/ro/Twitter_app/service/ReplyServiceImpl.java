package ro.Twitter_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.User;
import ro.Twitter_app.repository.ReplyRepository;

@Service
public class ReplyServiceImpl implements ReplyService {
    private final ReplyRepository replyRepository;
    @Autowired
    public ReplyServiceImpl(ReplyRepository replyRepository)
    {
        this.replyRepository=replyRepository;
    }

}
