package cn.fcsca.springbootjpa.controller;

import cn.fcsca.springbootjpa.entity.User;
import cn.fcsca.springbootjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * UserController
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 下午 19:34 2018-08-14
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable("id") Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    @GetMapping("/user")
    public User insertUser(User user) {
        User user1 = userRepository.save(user);
        return user1;
    }
}
