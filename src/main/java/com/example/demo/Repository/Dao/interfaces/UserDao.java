package com.example.demo.Repository.Dao.interfaces;

import com.example.demo.Repository.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {


}
