package com.example.messenger.model;

import java.util.Date;

public class Message {
    public int Id;
    public String textMessage;
    private long messageTime;
    public User User; // сообщение может быть у множества юзеров
    public Chat Chat; // сообщение может быть во множестве чатов
    public int chatId;
    public int userId;

    public Message(int id, String textMessage, com.example.messenger.model.User user, com.example.messenger.model.Chat chat, int chatId, int userId) {
        Id = id;
        this.textMessage = textMessage;
        User = user;
        Chat = chat;
        this.messageTime = new Date().getTime();
        this.chatId = chatId;
        this.userId = userId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public com.example.messenger.model.User getUser() {
        return User;
    }

    public void setUser(com.example.messenger.model.User user) {
        User = user;
    }

    public com.example.messenger.model.Chat getChat() {
        return Chat;
    }

    public void setChat(com.example.messenger.model.Chat chat) {
        Chat = chat;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

