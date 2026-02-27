import com.sun.tools.javac.Main;
import org.example.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTest {

    @Test
    public void createTicket() {
        Ticket testTicket = new Ticket(  "test", "test 1");
        testTicket.setStatus(Ticket.Status.OPEN);
        testTicket.setPriority(Ticket.Priority.LOW);
        assertEquals("Title: test Description: test 1", testTicket.toString());
        assertEquals("test", testTicket.getTitle());
        assertEquals("test 1", testTicket.getDescription());
        assertEquals("LOW", testTicket.getPriority().toString() );
        assertEquals("OPEN", testTicket.getStatus().toString());

    }

}
