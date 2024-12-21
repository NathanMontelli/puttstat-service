package com.puttstat.controller;

import com.puttstat.model.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public interface UserController {

    ResponseEntity<String> createUser(UserDTO userDTO);


}
