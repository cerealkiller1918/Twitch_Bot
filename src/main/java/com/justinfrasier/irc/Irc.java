package com.justinfrasier.irc;

public class Irc {
    public static String getMessage(String input){
        String[] strings = input.split(":");
        return  strings[2];
    }
    public static String getUserName(String input){
        String UserName = input.split("!")[0];
        UserName = UserName.replace(":","");
        return UserName;
    }

    public static String getChannel(String input){
        String channel = input.split("#")[1];
        channel = channel.split(":")[0].trim();
        return channel;
    }
}
