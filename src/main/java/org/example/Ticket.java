package org.example;

public class Ticket {

    //Ticket Class: Create a Ticket class with attributes: id, title, description, priority, and status (using Enums).

    private int id;
    private String title;
    private String description;
    private Priority priority;
    private Status status;


    public enum Priority {
        LOW, MEDIUM, HIGH;
    };

    public enum Status {
        OPEN("Open"), IN_PROGRESS("In Progress"), DONE("Done");

        private String status;

        Status(String status) {
            this.status = status;
        }
    }

    public Ticket( String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public Status getStatus() {
        return status;
    }
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Title: " + title + " Description: " + description;
    }



}
