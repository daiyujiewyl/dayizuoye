package io.dyj.jcartadministrationback.controller;

import io.dyj.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.dyj.jcartadministrationback.dto.in.ReturnUpdateActionInDTO;
import io.dyj.jcartadministrationback.dto.out.PageOutDTO;
import io.dyj.jcartadministrationback.dto.out.ReturnOutDTO;
import io.dyj.jcartadministrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                           @RequestParam Integer pageNum){
         return null;
    }


    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
          return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }
}
