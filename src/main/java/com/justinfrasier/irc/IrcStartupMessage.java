package com.justinfrasier.irc;

public class IrcStartupMessage {

    private String nick,oauth;

    public IrcStartupMessage(String nick, String oauth){
        this.nick = nick;
        this.oauth = oauth;
    }

    public String getPassMessage(){
        return "PASS oauth:"+oauth;
    }
    public String getNickMessage(){
        return "NICK "+nick;
    }
}
