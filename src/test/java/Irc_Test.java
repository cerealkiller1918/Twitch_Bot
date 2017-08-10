

import com.justinfrasier.irc.Irc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Irc_Test {

    private String userName="cerealkiller1918";
    private String channel = "Tom";
    private String message = "Hello Twitch";
    private String text = ":" + userName + "!" + userName + "@" + userName + ".tmi.twitch.tv PRIVMSG #" + channel + " :"
            + message;
    private Irc irc;

    @Before
    public void setup(){
        irc = new Irc(text);
    }

    @Test
    public void TestMessage(){
        assertEquals(message, irc.getMessage());
    }

    @Test
    public void TestUserName(){
        assertEquals(userName, irc.getUserName());
    }

    @Test
    public void TestChannel(){
        assertEquals(channel, irc.getChannel());
    }

}
