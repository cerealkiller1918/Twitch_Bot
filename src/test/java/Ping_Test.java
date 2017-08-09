
import org.junit.Test;

import static com.justinfrasier.irc.Ping.*;
import static org.junit.Assert.*;

public class Ping_Test {

    private String message = "PING :tmi.twitch.tv";

    @Test
    public void test_Ping_True(){
        assertTrue(checkForPing(message));
    }

    @Test
    public void test_Ping_False(){
        assertFalse(checkForPing("Not Ping"));
    }

    @Test
    public void test_Pong(){
        assertEquals("PONG :tmi.twitch.tv", pong());
    }
}
