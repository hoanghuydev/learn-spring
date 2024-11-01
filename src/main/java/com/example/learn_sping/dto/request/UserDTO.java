package com.example.learn_sping.dto.request;

import com.example.learn_sping.model.Conversation;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Set<Conversation> conversations = new HashSet<>();
}
