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


    public User save(User user) {
        return userRepository.save(user);
    }

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found user"));
        return userMapper.toDTO(user);
    }
}
