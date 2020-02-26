package io.dyj.jcartadministrationback.controller;

import io.dyj.jcartadministrationback.dto.in.*;
import io.dyj.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import io.dyj.jcartadministrationback.dto.out.AdministratorListOutDTO;
import io.dyj.jcartadministrationback.dto.out.AdministratorShowOutDTO;
import io.dyj.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String  login(AdministratorLoginInDTO administratorLoginInDTO){
       return null;
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(@RequestParam(required = false) Integer administratorId){

        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }

    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){
        return  null;
    }

    @GetMapping("/resetPwd")
    public void restPwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum){
        return  null;
    }

    @GetMapping("/getById")
    public AdministratorShowOutDTO getById(@RequestParam Integer administratorId){
       return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
       return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }
}
