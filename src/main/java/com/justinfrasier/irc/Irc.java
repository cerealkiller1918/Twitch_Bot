package com.justinfrasier.irc;

public class Irc {
    private String message,userName,channel;

    public Irc(String input){
        message = input.split(":")[2];
        userName = input.split("!")[0].replace(":","");
        channel = input.split("#")[1].split(":")[0].trim();
    }

    public String getMessage() {
        return message;
    }

    public String getUserName() {
        return userName;
    }

    public String getChannel() {
        return channel;
    }
}
