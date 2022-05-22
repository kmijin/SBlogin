package com.example.SBlogin.Dao;

import com.example.SBlogin.Model.DrHomesUser;
import com.example.SBlogin.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//DB와의 접근을 위한 기능 수행
@Repository
public class DrHomesUserDao {
    public static List<DrHomesUser> users;
//임시 객체
    static {
        users = new ArrayList<>();
        users.add(new DrHomesUser("admin@gmail.com", "admin", "admin", "2001-08-08", "여", 0, "2022-05-01"));
        users.add(new DrHomesUser("admin@gmail.com", "admin", "admin", "2001-08-08", "여", 0, "2022-05-01"));
        users.add(new DrHomesUser("admin@gmail.com", "admin", "admin", "2001-08-08", "여", 0, "2022-05-01"));
        users.add(new DrHomesUser("admin@gmail.com", "admin", "admin", "2001-08-08", "여", 0, "2022-05-01"));
    }
    //모든 유저 조회
    public List<DrHomesUser> getAllDrHomesUsers() {
        return users;
    }
    //유저 아이디 검색
    public DrHomesUser getUserByUserId(String userId) {
        return users
                .stream()
                .filter(drHomesUser -> drHomesUser.getUserId().equals(userId))
                .findAny()
                .orElse(new DrHomesUser("","","","","",0,""));
    }
    //유저 생성
    public DrHomesUser insertDrHomesUser(DrHomesUser drHomesUser) {
        users.add(drHomesUser);
        return drHomesUser;
    }
    //유저 수정
    public void updateUser(String userId, DrHomesUser drHomesUser){
        users.stream()
                .filter(curUser -> curUser.getUserId().equals(userId))
                .findAny()
                .orElse(new DrHomesUser("","","","","",0,""))
                .setUserName(drHomesUser.getUserName());
    }
    //유저 삭제
    public void deleteUser(String userId) {
        users.removeIf(drHomesUser -> drHomesUser.getUserId().equals(userId));
    }
}
