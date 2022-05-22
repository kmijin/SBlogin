package com.example.SBlogin.Service;

import com.example.SBlogin.Dao.UserDao;
import com.example.SBlogin.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    //Dao와의 통신을 위해 의존 설정을 해 놓았다.
    @Autowired
    UserDao userDao;
    //모든 유저 검색
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
    //유저 아이디 검색
    public User getUserByUserId(String userId) {
        return userDao.getUserByUserId(userId);
    }
    //유저 등록
    public User registerUser(User user) {
        return userDao.insertUser(user);
    }
    //유저 수정
    public void modifyUser(String userId, User user) {
        userDao.updateUser(userId, user);
    }
    //유저 삭제
    public void removeUser(String userId) {
        userDao.deleteUser(userId);
    }

}