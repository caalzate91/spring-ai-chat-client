package com.springchat.chatclient.controller;

import com.springchat.chatclient.model.ChatResponse;
import com.springchat.chatclient.service.ChatService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public ChatResponse chat(@RequestBody String message) {
        return new ChatResponse(this.chatService.sendMessage(message));
    }
}