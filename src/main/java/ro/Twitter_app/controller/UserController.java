package ro.Twitter_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ro.Twitter_app.model.DTO.UserDTO;
import ro.Twitter_app.model.User;
import ro.Twitter_app.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void registerUser(@RequestBody User user) {
        userService.register(user);
    }

    @GetMapping(value ="/users/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserDTO> search(@RequestBody String name)
    {
        return userService.search(name);
    }

    @PostMapping (value="/users/follow", produces = MediaType.APPLICATION_JSON_VALUE)
    public void follow(@RequestBody String follows, @RequestParam(name="followed") String followed)
    {
        userService.follow(follows,followed);
    }
}
