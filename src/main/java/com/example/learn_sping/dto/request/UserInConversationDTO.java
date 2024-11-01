package com.example.learn_sping.dto.request;

import com.example.learn_sping.model.Conversation;
import com.example.learn_sping.model.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInConversationDTO {
    private Long id;
    private User user;
    private Conversation conversation;
}
