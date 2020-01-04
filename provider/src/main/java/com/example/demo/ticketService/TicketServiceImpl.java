package com.example.demo.ticketService;

import com.alibaba.dubbo.config.annotation.Service;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Service
public class TicketServiceImpl implements TicketService {
    private static final Logger logger = Logger.getLogger(TicketServiceImpl.class);

    @Override
    public String getTickets() {
        return "hello " + System.currentTimeMillis();
    }

    @Override
    public Object getInfo(Map<String, Object> params) {
        logger.info(params);
        params.put("token",String.valueOf(System.currentTimeMillis()));
        return  params;
    }
}
