package ynu.hom.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ynu.hom.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/getUserById/{userId}")
    public User GetUserById(@PathVariable("userId") Integer userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("服务来自 17000");
        return user;
    }
}
