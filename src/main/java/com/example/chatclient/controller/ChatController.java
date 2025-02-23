package com.example.chatclient.controller;

import com.example.chatclient.model.ChatMessage;
import com.example.chatclient.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/send")
    public ResponseEntity<ChatMessage> sendMessage(@RequestBody ChatMessage chatMessage) {
        ChatMessage savedMessage = chatService.sendMessage(chatMessage);
        return ResponseEntity.ok(savedMessage);
    }

    @GetMapping("/messages")
    public ResponseEntity<List<ChatMessage>> getMessages() {
        List<ChatMessage> messages = chatService.getMessages();
        return ResponseEntity.ok(messages);
    }
}