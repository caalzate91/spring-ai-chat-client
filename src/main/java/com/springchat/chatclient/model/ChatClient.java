package com.springchat.chatclient.model;

import org.springframework.stereotype.Component;

@Component
public interface ChatClient {

    Prompt prompt();

    interface Builder {
        ChatClient build();
    }

    interface Prompt {
        Prompt user(String message);
        Response call();
    }

    interface Response {
        String content();
    }
}
