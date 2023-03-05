package com.example.demo.Presentation.DTOs.ResponseDTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {

    private String username;
    private String name;
    private String gender;
    private String email;
    private String phone;
    private String addressStreetName;
    private String addressCityName;
    private String addreessCountryName;
}
