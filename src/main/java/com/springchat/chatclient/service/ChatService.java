package com.springchat.chatclient.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final ChatClient chatClient;

    public ChatService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String sendMessage(String content) {
        return this.chatClient.prompt(content)
                .call()
                .content();
    }
}