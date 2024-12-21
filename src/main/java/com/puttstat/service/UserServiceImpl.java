package com.puttstat.service;

import com.puttstat.mapper.UserMapper;
import com.puttstat.model.dto.UserDTO;
import com.puttstat.model.jpa.UserEntity;
import com.puttstat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    public void createUser(UserDTO userDto) {
        UserEntity userEntity = userMapper.toEntity(userDto);
        userRepository.save(userEntity);
    }
}
