package com.luanrafael.servicedesk.service;

import com.luanrafael.servicedesk.exception.InvalidTicketException;
import com.luanrafael.servicedesk.model.CreateTicketRequest;
import com.luanrafael.servicedesk.model.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void shouldThrowWhenTitleIsEmpty() {
        CreateTicketRequest ticketRequest = new CreateTicketRequest();
        ticketRequest.setTitle("");
        ticketRequest.setDescription("funk");

        TicketService ticketService = new TicketService();

        assertThrows(InvalidTicketException.class, () -> ticketService.createTicket(ticketRequest));
    }

    @Test
    void shouldThrowWhenDescriptionIsBlank() {
        CreateTicketRequest ticketRequest = new CreateTicketRequest();
        ticketRequest.setTitle("da");
        ticketRequest.setDescription(" ");

        TicketService ticketService = new TicketService();

        assertThrows(InvalidTicketException.class, () -> ticketService.createTicket(ticketRequest));
    }
}
