package com.example.SBlogin.Service;

import com.example.SBlogin.Dao.DrHomesUserDao;
import com.example.SBlogin.Dao.UserDao;
import com.example.SBlogin.Model.DrHomesUser;
import com.example.SBlogin.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrHomesService {
    //Dao와의 통신을 위해 의존 설정을 해 놓았다.
    @Autowired
    DrHomesUserDao drHomesUserDao;
    //모든 유저 검색
    public List<DrHomesUser> getAllDrHomesUsers() {
        return drHomesUserDao.getAllDrHomesUsers();
    }
    //유저 아이디 검색
    public DrHomesUser getUserByUserId(String userId) {
        return drHomesUserDao.getUserByUserId(userId);
    }
    //유저 등록
    public DrHomesUser registerUser(DrHomesUser drHomesUser) {
        return drHomesUserDao.insertDrHomesUser(drHomesUser);
    }
    //유저 수정
    public void modifyUser(String userId, DrHomesUser drHomesUser) {
        drHomesUserDao.updateUser(userId, drHomesUser);
    }
    //유저 삭제
    public void removeUser(String userId) {
        drHomesUserDao.deleteUser(userId);
    }

}