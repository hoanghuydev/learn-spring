package com.example.learn_sping.dto.request;

import com.example.learn_sping.model.Conversation;
import com.example.learn_sping.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDTO {
    private Long id;
    private Conversation conversation;
    private User sender;
    private String content;
    private java.util.Date sentAt = new java.util.Date();
}
