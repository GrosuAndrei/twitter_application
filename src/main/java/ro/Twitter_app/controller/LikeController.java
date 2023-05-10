package ro.Twitter_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.Twitter_app.service.LikeService;
import ro.Twitter_app.service.PostService;
import ro.Twitter_app.service.UserService;

@RestController
public class LikeController {
    @Autowired
    private LikeService likeService;
    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;

    @PostMapping(value="/users/posts/like", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void likePost()
    {
        likeService.setCurrentPost(postService.getCurrentPost());
        likeService.setCurrentUser(userService.getCurrentUser());
        likeService.likePost();
    }
}
