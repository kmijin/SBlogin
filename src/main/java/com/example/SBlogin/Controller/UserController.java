package com.example.SBlogin.Controller;

import com.example.SBlogin.Model.User;
import com.example.SBlogin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    //모든 유저 조회
    @GetMapping("")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    //유저 아이디 조회
    @GetMapping("/{userid}")
    public User getUserByUserId(@PathVariable String userid) {
        return userService.getUserByUserId(userid);
    }

    //유저 등록
    @PostMapping("")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    //유저 수정
    @PutMapping("/{userid}")
    public void modifyUser(@PathVariable String userid, @RequestBody User user) {
        userService.modifyUser(userid, user);
    }

    //유저 삭제
    @DeleteMapping("/{userid}")
    public void removeUser(@PathVariable String userid) {
        userService.removeUser(userid);
    }
}
