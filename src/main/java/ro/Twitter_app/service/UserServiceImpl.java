package ro.Twitter_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.Twitter_app.mapper.UserMapper;
import ro.Twitter_app.model.User;
import ro.Twitter_app.repository.UserRepository;
import ro.Twitter_app.util.UserUtil;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final UserUtil userUtil;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserUtil userUtil, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userUtil = userUtil;
        this.userMapper=userMapper;
    }

    public void register(User user)
    {
        if(!userRepository.existsByUserName(user.getUserName()))
            userRepository.save(user);
        else
            System.out.println("user already exists");
    }


}
