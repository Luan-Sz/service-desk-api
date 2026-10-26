package com.luanrafael.servicedesk.service;

import com.luanrafael.servicedesk.model.CreateTicketRequest;
import com.luanrafael.servicedesk.model.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketServiceTest {
    @Test
    void shouldCreateTicketWithRequestData() {
        CreateTicketRequest ticketRequest = new CreateTicketRequest();
        ticketRequest.setTitle("da");
        ticketRequest.setDescription("funk");

        TicketService ticketService = new TicketService();
        Ticket ticket = ticketService.createTicket(ticketRequest);

        assertEquals(
                ticketRequest.getTitle(),
                ticket.getTitle()
        );

        assertEquals(
                ticketRequest.getDescription(),
                ticket.getDescription()
        );
    }
}
