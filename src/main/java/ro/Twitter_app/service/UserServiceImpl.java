package ro.Twitter_app.service;

import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.Twitter_app.mapper.UserMapper;
import ro.Twitter_app.model.DTO.UserDTO;
import ro.Twitter_app.model.User;
import ro.Twitter_app.repository.UserRepository;
import ro.Twitter_app.util.UserUtil;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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
        if(userRepository.findUserByUsername(user.getUsername()).isPresent())
            System.out.println("existing user");
        else
             userRepository.save(user);
    }
    public List<UserDTO> search(String name)
    {
         return userRepository.searchByUsernameOrFirstnameOrLastname(name,name,name).stream()
                .map(userMapper::userToUserDTO)
                .collect(Collectors.toList());
    }

    public void follow(String name_follows, String name_followed)
    {
        User followed=userRepository.findUserByUsername(name_followed).get();
        User follows=userRepository.findUserByUsername(name_follows).get();
        if(follows==null || followed==null)
            return;
        if(followed.getFollowers().contains(follows))
            return;
        followed.getFollowers().add(follows);
        follows.getFollowing().add(followed);
    }
}
