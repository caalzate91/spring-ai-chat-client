package com.springchat.chatclient.service;

import com.springchat.chatclient.model.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final ChatClient chatClient;

    public ChatService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String sendMessage(String content) {
        return this.chatClient.prompt()
                .user(content)
                .call()
                .content();
    }
}