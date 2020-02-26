package io.dyj.jcartadministrationback.controller;

import io.dyj.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.dyj.jcartadministrationback.dto.out.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO,
                                             @RequestParam Integer pageNum){
          return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }

    @GetMapping("/getInvoice")
    public OrderInvoiceShowOutDTo getInvoice(@RequestParam Long orderId){
       return null;
    }

    @GetMapping("/getShipInfo")
    public OrderShipShowOudtDTO getShipInfo(@RequestParam Long orderId){
        return null;
    }
}
