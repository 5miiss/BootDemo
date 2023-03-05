package com.example.demo.Buisness.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Presentation.DTOs.RequestDTOs.UserRequestDto;
import com.example.demo.Repository.Dao.interfaces.UserDao;

public class UserServiceimpl {
    
    @Autowired
    private UserDao userDao;


    // public void addUser(UserRequestDto user){

    //     userDao.save(user);
    // }
}
