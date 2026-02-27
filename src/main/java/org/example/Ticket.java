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

    public enum Status {
        OPEN("Open"), IN_PROGRESS("In Progress"), DONE("Done");

        private String status;

        Status(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
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

    @Override
    public String toString() {
        return "Title: " + title + " Description: " + description;
    }



}
