package com.example.demo.userService;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.ticketService.TicketService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public Object hello(){
        System.out.println(ticketService);
        System.out.println(ticketService.getTickets());

        return ticketService.getTickets();
    }
    public Object info(Map<String, Object> params){
       return  ticketService.getInfo(params);
    }
}
