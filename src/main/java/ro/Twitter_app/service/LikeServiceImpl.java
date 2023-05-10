package ro.Twitter_app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.User;
import ro.Twitter_app.repository.LikeRepository;

@Service
public class LikeServiceImpl {
    private final LikeRepository likeRepository;

    @Autowired
    public LikeServiceImpl(LikeRepository likeRepository)
    {
        this.likeRepository=likeRepository;
    }

    public void likePost()
    {
        likeRepository.like_a_post();
    }

    public void setCurrentPost(Post currentPost)
    {
        likeRepository.setCurrentPost(currentPost);
    }

    public void setCurrentUser(User currentUser)
    {
        likeRepository.setCurrentUser(currentUser);
    }

}
