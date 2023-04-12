package com.javatechie.service;

import com.javatechie.dto.UserDto;
import com.javatechie.entity.UserInfo;
import com.javatechie.repository.UserInfoRepository;
import com.javatechie.utils.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private UserInfoRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<UserInfo> listUser(){
        return repository.findAll();
    }

    public UserInfo addUser( UserDto userDto) {
        UserInfo userInfo = new UserInfo();
        userInfo.setPassword(passwordEncoder.encode(userDto.getPassWord()));
        userInfo.setName(userDto.getName());
        userInfo.setRole(userDto.getRole());
        userInfo.setEmail(userDto.getEmail());
        userInfo.setLast_name(userDto.getLastName());
        userInfo.setFirst_name(userDto.getFirstName());
        userInfo.setCreated_date(DataUtils.buildBaseEntity().getCreated_date());
        userInfo.setCreated_by(DataUtils.buildBaseEntity().getCreated_by());
        return repository.save(userInfo);
    }
}
