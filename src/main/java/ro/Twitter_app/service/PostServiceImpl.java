package ro.Twitter_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.User;
import ro.Twitter_app.repository.PostRepository;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{
    private final PostRepository postRepository;
    @Autowired
    public PostServiceImpl(PostRepository postRepository)
    {
        this.postRepository=postRepository;
    }


}
