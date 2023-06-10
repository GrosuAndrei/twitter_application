package ro.Twitter_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ro.Twitter_app.model.Post;
import ro.Twitter_app.service.PostService;
import ro.Twitter_app.service.UserService;

@RestController
public class PostController {
    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;

//    @PostMapping(value="/users/post", produces = MediaType.APPLICATION_JSON_VALUE)
//    public void createPost(@RequestBody Post post)
//    {
//        postService.setCurrentUser(userService.getCurrentUser());
//        postService.createNewPost(post);
//    }
//    @GetMapping(value="/users/posts/getMyPosts", produces = MediaType.APPLICATION_JSON_VALUE)
//    public void getMyPosts()
//    {
//        postService.getOwnPosts();
//    }
//    @GetMapping(value="/users/posts/getFeed", produces = MediaType.APPLICATION_JSON_VALUE)
//    public void getFeed()
//    {
//        postService.getFeed();
//    }
//    @GetMapping(value="/users/posts/currentPost", produces = MediaType.APPLICATION_JSON_VALUE)
//    public void switchToAnotherPost(@RequestBody Post post)
//    {
//        postService.selectPost(post);
//    }
}
