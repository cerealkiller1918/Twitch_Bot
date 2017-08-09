package com.justinfrasier.irc;

public class Ping {
    public static String pong(){
        return "PONG :tmi.twitch.tv";
    }

    public static boolean checkForPing(String input){
        if(input.startsWith("PING"))return true;
        else return false;
    }

}
