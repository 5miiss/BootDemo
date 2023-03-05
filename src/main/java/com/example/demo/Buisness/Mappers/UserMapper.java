package com.example.demo.Buisness.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.Presentation.DTOs.RequestDTOs.UserRequestDto;
import com.example.demo.Repository.Entities.User;

@Mapper
public interface UserMapper {
    UserMapper instance =Mappers.getMapper(UserMapper.class);
    User fromUserDtoToUser(UserRequestDto user);

    UserRequestDto fromModelToDto(User user);
}
