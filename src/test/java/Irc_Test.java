
import static com.justinfrasier.irc.Irc.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class Irc_Test {

    private String userName="cerealkiller1918";
    private String channel = "Tom";
    private String message = "Hello Twitch";
    private String text = ":" + userName + "!" + userName + "@" + userName + ".tmi.twitch.tv PRIVMSG #" + channel + " :"
            + message;

    @Test
    public void TestMessage(){
        assertEquals(message, getMessage(text));
    }

    @Test
    public void TestUserName(){
        assertEquals(userName, getUserName(text));
    }

    @Test
    public void TestChannel(){
        assertEquals(channel, getChannel(text));
    }

}
