import com.sun.tools.javac.Main;
import org.example.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTest {

    @Test
    public void createTicket() {
        Ticket testTicket = new Ticket(  "test", "test 1");
        assertEquals("Title: test Description: test 1", testTicket.toString());

    }

}
