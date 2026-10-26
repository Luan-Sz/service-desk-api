package com.luanrafael.servicedesk.service;

import com.luanrafael.servicedesk.exception.InvalidTicketException;
import com.luanrafael.servicedesk.model.CreateTicketRequest;
import com.luanrafael.servicedesk.model.Ticket;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    public Ticket createTicket(CreateTicketRequest ticketRequest) {
        if (ticketRequest.getTitle() == null || ticketRequest.getTitle().isBlank()) {
            throw new InvalidTicketException("Ticket title cannot be blank");
        }

        if (ticketRequest.getDescription() == null || ticketRequest.getDescription().isBlank()) {
            throw new InvalidTicketException("Ticket description cannot be blank");
        }

        return new Ticket(ticketRequest.getTitle(), ticketRequest.getDescription());
    }
}
