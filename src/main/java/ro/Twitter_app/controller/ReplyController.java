package ro.Twitter_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ro.Twitter_app.service.PostService;
import ro.Twitter_app.service.ReplyService;
import ro.Twitter_app.service.UserService;

@RestController
public class ReplyController {
    @Autowired
    private ReplyService replyService;
    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;

    @PostMapping(value="/users/posts/reply", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void replyToPost(@RequestBody String message)
    {
        replyService.setCurrentPost(postService.getCurrentPost());
        replyService.setCurrentUser(userService.getCurrentUser());
        replyService.reply_to_a_post(message);
    }
}
