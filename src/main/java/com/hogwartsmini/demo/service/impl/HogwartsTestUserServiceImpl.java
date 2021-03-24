package com.hogwartsmini.demo.service.impl;

import com.hogwartsmini.demo.dto.UserDto;
import com.hogwartsmini.demo.service.HogwartsTestUserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HogwartsTestUserServiceImpl implements HogwartsTestUserService {
    @Override
    public String login(UserDto userDto) {
        System.out.println("userDto.getName() " + userDto.getName());
        System.out.println("userDto.getPwd() " + userDto.getPwd());
        return userDto.getName() + " - " + userDto.getPwd();
    }
}
