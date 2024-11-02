package com.example.learn_sping.mapper;

import com.example.learn_sping.dto.request.ConversationDTO;
import com.example.learn_sping.model.Conversation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConversationMapper {
    ConversationDTO toDTO(Conversation conversation);
    Conversation toEntity(ConversationDTO conversationDTO);
}
