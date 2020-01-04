package com.example.demo.ticketService;

import java.util.Map;

public interface TicketService {
    String getTickets();
    Object getInfo(Map<String,Object> params);
}
