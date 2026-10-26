package com.luanrafael.servicedesk.controller;

import com.luanrafael.servicedesk.model.CreateTicketRequest;
import com.luanrafael.servicedesk.model.Ticket;
import com.luanrafael.servicedesk.service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/tickets")
    public String listTickets(
            @RequestParam(value = "status", required = false) String ticketStatus,
            @RequestParam(value = "priority", required = false) String ticketPriority
    ) {
        if (ticketStatus != null && ticketPriority == null) {
            return "Ticket Status = " + ticketStatus;
        } else if (ticketPriority != null && ticketStatus == null) {
            return "Ticket Priority = " + ticketPriority;
        } else if (ticketStatus != null && ticketPriority != null) {
            return "Ticket Status = " + ticketStatus + ", Ticket Priority = " + ticketPriority;
        } else {
            return "All Tickets";
        }
    }

    @GetMapping("/tickets/{ticketId}")
    public String findById(@PathVariable("ticketId") int ticketId) {
        return "ticketId " + ticketId;
    }

    @PostMapping("/tickets")
    @ResponseStatus(HttpStatus.CREATED)
    public Ticket createTicketRequest(
            @RequestBody CreateTicketRequest ticketRequest
    ) {
        return ticketService.createTicket(ticketRequest);
    }
}
