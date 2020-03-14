package io.dyj.jcartadministrationback.controller;

import com.github.pagehelper.Page;
import io.dyj.jcartadministrationback.dto.in.OrderSearchInDTO;
import io.dyj.jcartadministrationback.dto.out.*;
import io.dyj.jcartadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO,
                              @RequestParam(required = false,defaultValue = "1") Integer pageNum){
        Page<OrderListOutDTO> page = orderService.search(pageNum);
        PageOutDTO<OrderListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setList(page);
        return pageOutDTO;
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
