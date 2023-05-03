package com.Prog.Twitter.post;

import com.Prog.Twitter.user.User;
import com.Prog.Twitter.user.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PostController extends UserController {
    public PostController(User user, ArrayList<User> listOfUsers) {
        super(user, listOfUsers);
    }

    @PutMapping("/post")
    public String post(@RequestBody Post post) {
        if (listOfUsers.stream()
                .filter(x -> x.getUsername().equals(post.getOwner()))
                .findFirst()
                .orElse(null) == null) {
            return "user not found";
        } else {
            user.getPostari().add(post);
            return "Postarea Salvata";
        }
    }

    @GetMapping("/getOwnPosts")
    public ArrayList<Post> getOwnPosts(String username)
    {
        User newUser=listOfUsers.stream()
                .filter(x->x.getUsername().equals(username))
                .findFirst()
                .orElse(null);
        return (ArrayList<Post>) newUser.getPostari();
    }
}
