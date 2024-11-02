package com.example.learn_sping.service;

import com.example.learn_sping.dto.request.UserDTO;
import com.example.learn_sping.mapper.UserMapper;
import com.example.learn_sping.model.User;
import com.example.learn_sping.repository.UserRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;


    public UserDTO save(UserDTO userData) {
        if (userData == null) {
            throw new IllegalArgumentException("User data cannot be null");
        }
        User user = userMapper.toEntity(userData);
        if (userRepository.existsByUsername(user.getUsername())) {
            throw new IllegalArgumentException("Username already exists");
        }
        if (user.getUsername() == null || user.getEmail() == null || user.getPassword() == null) {
            throw new IllegalArgumentException("Username, email, and password must not be null");
        }
        User savedUser = userRepository.save(user);
        return userMapper.toDTO(savedUser);
    }

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found user"));
        return userMapper.toDTO(user);
    }
}
