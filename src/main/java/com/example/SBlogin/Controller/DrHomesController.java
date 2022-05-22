package com.example.SBlogin.Controller;

import com.example.SBlogin.Model.DrHomesUser;
import com.example.SBlogin.Model.User;
import com.example.SBlogin.Service.DrHomesService;
import com.example.SBlogin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drHomesUser")
public class DrHomesController {
    @Autowired
    private DrHomesService drHomesService;

    //모든 유저 조회
    @GetMapping("")
    public List<DrHomesUser> getAllDrHomesUsers() {
        return drHomesService.getAllDrHomesUsers();
    }

    //유저 아이디 조회
    @GetMapping("/{userid}")
    public DrHomesUser getUserByUserId(@PathVariable String userid) {
        return drHomesService.getUserByUserId(userid);
    }

    //유저 등록
    @PostMapping("")
    public DrHomesUser registerUser(@RequestBody DrHomesUser drHomesUser) {
        return drHomesService.registerUser(drHomesUser);
    }

    //유저 수정
    @PutMapping("/{userid}")
    public void modifyUser(@PathVariable String userid, @RequestBody DrHomesUser drHomesUser) {
        drHomesService.modifyUser(userid, drHomesUser);
    }

    //유저 삭제
    @DeleteMapping("/{userid}")
    public void removeUser(@PathVariable String userid) {
        drHomesService.removeUser(userid);
    }
}