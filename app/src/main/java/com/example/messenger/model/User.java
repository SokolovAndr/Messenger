package com.example.messenger.model;

import java.util.List;

public class User {
    public int Id;
    public String Login;
    public String Email;
    public List<Chat> chats;  //юзер может быть во множестве групповых чатов
    public int chatId;
    public int messageId;

    public User(int id, String login, String email, List<Chat> chats, int chatId, int userId) {
        Id = id;
        Login = login;
        Email = email;
        this.chats = chats;
        this.chatId = chatId;
        this.messageId = userId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }
}
