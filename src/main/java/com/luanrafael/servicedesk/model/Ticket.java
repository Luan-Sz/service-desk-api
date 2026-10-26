package com.luanrafael.servicedesk.model;

import java.time.LocalDateTime;

public class Ticket {
    private String title;
    private String description;
    private TicketPriority priority;
    private TicketStatus status;
    private LocalDateTime createdAt;

    public Ticket(String title, String description) {
        this.title = title;
        this.description = description;
        this.status = TicketStatus.WAITING_TRIAGE;
        this.createdAt = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TicketPriority getPriority() {
        return priority;
    }

    public void setPriority(TicketPriority priority) {
        this.priority = priority;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
