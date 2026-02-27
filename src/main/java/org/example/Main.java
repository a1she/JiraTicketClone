package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static String title;
    private static String description;

    public static void main(String[] args) {
        Ticket ticket = new Ticket(title, description);
        returnToString(ticket);
    }

    public static String returnToString(Ticket ticket) {
        return ticket.toString();
    }
}
