package com.springchat.chatclient.controller;

import com.springchat.chatclient.service.ChatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public ResponseEntity<String> chat(@RequestParam(value = "message") String message) {
        return ResponseEntity.ok(chatService.sendMessage(message));
    }
}