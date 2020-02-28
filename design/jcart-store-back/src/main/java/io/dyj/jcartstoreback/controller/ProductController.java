package io.dyj.jcartstoreback.controller;

import io.dyj.jcartstoreback.dto.in.ProductSearchInDTO;
import io.dyj.jcartstoreback.dto.out.PageOutDTO;
import io.dyj.jcartstoreback.dto.out.ProductListOutDTO;
import io.dyj.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
             return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

}
