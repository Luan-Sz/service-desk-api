package com.luanrafael.servicedesk.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TicketTest {
    @Test
    void shouldBeWaitingTriage() {
        Ticket ticket = new Ticket("da", "funk");

        assertEquals(
                TicketStatus.WAITING_TRIAGE,
                ticket.getStatus()
        );
    }

    @Test
    void shouldHaveNoPriority() {
        Ticket ticket = new Ticket("da", "funk");

        assertNull(ticket.getPriority());
    }
}
