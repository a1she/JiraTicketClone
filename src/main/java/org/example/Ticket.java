package org.example;

public class Ticket {

    //Ticket Class: Create a Ticket class with attributes: id, title, description, priority, and status (using Enums).

    private int id;
    private String title;
    private String description;

    enum Priority {
        LOW, MEDIUM, HIGH;
    };

    enum Status {
        OPEN, IN_PROGRESS, DONE;

    }


    public Ticket( String title, String description){
        this.title = title;
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description =description;
    }

    @Override
    public String toString() {
        return "Title: " + title + " Description: " + description;
    }
}
