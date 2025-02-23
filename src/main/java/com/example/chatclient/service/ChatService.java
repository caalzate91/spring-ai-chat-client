package com.example.chatclient.service;

import com.example.chatclient.model.ChatMessage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {

    private final List<ChatMessage> chatHistory = new ArrayList<>();

    public ChatMessage sendMessage(String sender, String content) {
        ChatMessage message = new ChatMessage(sender, content);
        chatHistory.add(message);
        // Here you would typically call the Vertex AI model to process the message
        return message;
    }

    public List<ChatMessage> getMessages() {
        return new ArrayList<>(chatHistory);
    }
}