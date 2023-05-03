package com.Prog.Twitter.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController

public class UserController {
    protected User user;
    protected ArrayList<User> listOfUsers;
    @Autowired
    public UserController(User user, ArrayList<User> listOfUsers)
    {
        this.user=user;
        this.listOfUsers=listOfUsers;
    }

    @PutMapping("/register")
    @ResponseBody
    public String register(@RequestBody User user)
    {
        if(listOfUsers.stream()
            .filter(x->x.getUsername().equals(user.getUsername()))
            .findFirst()
            .orElse(null)!=null)
            return "username-ul este deja utilizat";
        else {
            listOfUsers.add(user);
            return user.getUsername() + " registered successfully ";
        }
    }

    @PostMapping("/search")
    @ResponseBody
    public List<User> search(@RequestBody String name)
    {
        if(listOfUsers != null)
            System.out.println(listOfUsers);
        else
            System.out.println("gol");
        return listOfUsers.stream()
                .filter(x->(x.getUsername().equals(name)||x.getFirstName().equals(name)||x.getLastName().equals(name)))
                .collect(Collectors.toList());
    }

    @ResponseBody
    @GetMapping("/login")
    public String login(@RequestBody Login login)
    {
        this.user=listOfUsers.stream()
                .filter(x->(x.getUsername().equals(login.getUsername())&&x.getPassword().equals(login.getPassword())))
                .findFirst()
                .orElse(null);
        if(this.user!=null)
            return user.getUsername() + " Successfull autentification";
        else
            return "Wrong username or password";
    }

    @GetMapping("/follow")
    @ResponseBody
    public String follow(@RequestBody String name)
    {
        User newuser=listOfUsers.stream()
                        .filter(x->x.getUsername().equals(name))
                        .findFirst()
                        .orElse(null);
        this.user.getFollows().add(newuser);
        return "now you follow " + newuser.getUsername();
    }

}
