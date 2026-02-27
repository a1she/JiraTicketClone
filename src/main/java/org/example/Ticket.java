package org.example;

public class Ticket {

    //Ticket Class: Create a Ticket class with attributes: id, title, description, priority, and status (using Enums).

    private int id;
    private String title;
    private String description;

    public enum Priority {
        LOW("low-level"), MEDIUM("medium-level"), HIGH("high-level");

        private String priority;

        Priority( String priority) {
            this.priority = priority;
        }

        public String getPriority() {
            return priority;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }
    };

    enum Status {
        OPEN, IN_PROGRESS, DONE;
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

    @Override
    public String toString() {
        return "Title: " + title + " Description: " + description;
    }



}
