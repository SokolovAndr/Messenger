package com.example.messenger.model;

import java.util.List;

public class Chat {

    public int Id;
    public List<User> users; //в групповых чатах может быть множество юзеров
    public List <Message> messages; //множество сообщений

    public Chat(int id, List<User> users, List<Message> messages) {
        Id = id;
        this.users = users;
        this.messages = messages;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
