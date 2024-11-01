package com.example.learn_sping.dto.request;

import com.example.learn_sping.model.Message;
import com.example.learn_sping.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
public class ConversationDTO {
    private Long id;
    private String title;
    private Date createdAt = new Date();
    private Set<User> participants = new HashSet<>();
    private Set<Message> messages = new HashSet<>();
}
