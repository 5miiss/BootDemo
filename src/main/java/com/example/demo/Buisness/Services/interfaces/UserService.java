package com.example.demo.Buisness.Services.interfaces;

import com.example.demo.Presentation.DTOs.RequestDTOs.UserRequestDto;
import com.example.demo.Repository.Dao.interfaces.UserDao;
import com.example.demo.Repository.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public interface UserService {


    public void addUser(UserRequestDto user);
}
