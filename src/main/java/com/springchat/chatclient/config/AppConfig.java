package com.springchat.chatclient.config;

import com.springchat.chatclient.model.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ChatClient chatClient() {
        return () -> null;
    }
}