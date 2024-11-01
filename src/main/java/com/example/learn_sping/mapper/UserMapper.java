package com.example.learn_sping.mapper;

import com.example.learn_sping.dto.request.UserDTO;
import com.example.learn_sping.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}
