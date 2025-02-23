package com.springchat.chatclient.model;

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
