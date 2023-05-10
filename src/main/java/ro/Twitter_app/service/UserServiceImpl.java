package ro.Twitter_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.Twitter_app.model.LogIn;
import ro.Twitter_app.model.User;
import ro.Twitter_app.repository.UserRepository;
import ro.Twitter_app.util.UserUtil;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserUtil userUtil;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserUtil userUtil) {
        this.userRepository = userRepository;
        this.userUtil = userUtil;
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User getUserById(Integer id) {
        return userRepository.getUserById(id);
    }

    public void registerUser(User user) {
        userRepository.createUser(user);
    }

    public void updateUser(Integer id, User user) {
        userRepository.updateUser(id, user);
    }

    public void patchUser(Integer id, Map<String, String> partialUser) {
        User user = userRepository.getUserById(id);

        userUtil.patchUser(user, partialUser);

        userRepository.updateUser(id, user);
    }
    public void deleteUser(Integer id) {
        userRepository.deleteUser(id);
    }
    public List<User> getListOfUsersByName(String name)
    {
        return userRepository.getListOfUsersByName(name);
    }
    public void signIn(LogIn login)
    {
        userRepository.autentification(login);
    }
    public void follow(String name)
    {
        userRepository.follow(name);
    }
    public User getCurrentUser()
    {
        return userRepository.getCurrentUser();
    }
}
