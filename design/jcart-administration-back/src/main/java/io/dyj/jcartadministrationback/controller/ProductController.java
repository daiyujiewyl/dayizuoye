package io.dyj.jcartadministrationback.controller;

import io.dyj.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.dyj.jcartadministrationback.dto.out.PageOutDTO;
import io.dyj.jcartadministrationback.dto.out.ProductListOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return  null;
    }
}
