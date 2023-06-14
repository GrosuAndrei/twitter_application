package ro.Twitter_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ro.Twitter_app.model.DTO.PostDTO;
import ro.Twitter_app.model.DTO.ReplyDTO;
import ro.Twitter_app.model.Post;
import ro.Twitter_app.service.PostService;
import ro.Twitter_app.service.UserService;
import java.util.*;
import java.time.LocalDate;

@RestController
public class PostController {
    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;

    @PostMapping(value="/users/post", produces = MediaType.APPLICATION_JSON_VALUE)
    public void createPost(@RequestParam(name="userid") Long userid, @RequestBody String message)
    {
        postService.createPost(userid, message);
    }
    @GetMapping(value="/users/posts/getMyPosts", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PostDTO> getMyPosts(@RequestParam(name="userid") Long userid, @RequestBody LocalDate timestomp)
    {
        return postService.getOwnPosts(userid,timestomp);
    }
    @GetMapping(value="/users/posts/getFeed", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PostDTO> getFeed(@RequestParam(name="userid") Long userid)
    {
        return postService.getFeed(userid);
    }

    @PostMapping(value = "/users/posts/like", produces = MediaType.APPLICATION_JSON_VALUE)
    public void likePost(@RequestParam(name="userid") Long userid, @RequestBody Long postid)
    {
        postService.likePost(postid,userid);
    }

    @PostMapping(value="/users/posts/reply", produces = MediaType.APPLICATION_JSON_VALUE)
    public void replyToPost(@RequestBody ReplyDTO replyDTO)
    {
        postService.replyToAPost(replyDTO);
    }
}
