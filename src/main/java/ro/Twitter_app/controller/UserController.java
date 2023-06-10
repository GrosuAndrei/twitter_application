package ro.Twitter_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ro.Twitter_app.model.User;
import ro.Twitter_app.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


//    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }
//
//    @GetMapping(value = "/users/{id}", produces = MediaType.APPLICATION_XML_VALUE)
//    public User getUserById(@PathVariable Integer id) {
//        return userService.getUserById(id);
//    }
//
    @PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void registerUser(@RequestBody User user) {
        userService.register(user);
    }
//
//    @PutMapping(value = "/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public void updateUser(@PathVariable Integer id, @RequestBody User user) {
//        userService.updateUser(id, user);
//    }
//    @DeleteMapping(value = "/users/{id}")
//    public void deleteUser(@PathVariable Integer id) {
//        userService.deleteUser(id);
//    }
//    @GetMapping(value ="/users/search", produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<User> search(@RequestBody String name)
//    {
//        return userService.getListOfUsersByName(name);
//    }
//    @GetMapping(value="/users/signIn", produces = MediaType.APPLICATION_JSON_VALUE)
//    public void signIn(@RequestBody LogIn login)
//    {
//        userService.signIn(login);
//    }
//    @GetMapping(value="/users/follow", produces = MediaType.APPLICATION_JSON_VALUE)
//    public void follow(@RequestBody String name)
//    {
//        userService.follow(name);
//    }
}
