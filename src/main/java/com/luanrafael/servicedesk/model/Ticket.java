package com.luanrafael.servicedesk.model;

public class Ticket {
    private String title;
    private String priority;

    public Ticket() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
