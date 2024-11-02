package com.example.learn_sping.service;

import com.example.learn_sping.mapper.ConversationMapper;
import com.example.learn_sping.repository.ConversationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConversationService {
    @Autowired
    private ConversationRepository conversationRepository;
    @Autowired
    private ConversationMapper conversationMapper;

}
