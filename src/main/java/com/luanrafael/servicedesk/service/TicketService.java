package com.luanrafael.servicedesk.service;

import com.luanrafael.servicedesk.exception.InvalidTicketException;
import com.luanrafael.servicedesk.model.Ticket;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    public Ticket createTicket(Ticket ticket) {
        if (ticket.getTitle() == null || ticket.getTitle().isBlank()) {
            throw new InvalidTicketException("Ticket title cannot be blank");
        }
        return ticket;
    }
}
