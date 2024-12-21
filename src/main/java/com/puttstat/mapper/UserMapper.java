package com.puttstat.mapper;

import com.puttstat.model.dto.UserDTO;
import com.puttstat.model.jpa.UserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends GenericMapper<UserEntity, UserDTO> {

}
