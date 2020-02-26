package io.dyj.jcartadministrationback.controller;


import io.dyj.jcartadministrationback.dto.in.CustomerSearchInDTO;
import io.dyj.jcartadministrationback.dto.out.CustomerListOutDTO;
import io.dyj.jcartadministrationback.dto.out.CustomerShowOutDTO;
import io.dyj.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
         return  null;
    }

    @PostMapping("/disable")
    public Integer disable(@RequestParam Integer customerId){
        return null;
    }
}
