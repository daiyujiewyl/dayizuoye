package io.dyj.jcartstoreback.controller;

import at.favre.lib.crypto.bcrypt.BCrypt;
import io.dyj.jcartstoreback.constant.ClientExceptionConstant;

import io.dyj.jcartstoreback.dto.in.*;
import io.dyj.jcartstoreback.dto.out.CustomerGetProfileOutDTO;
import io.dyj.jcartstoreback.dto.out.CustomerLoginOutDTO;
import io.dyj.jcartstoreback.exception.ClientException;
import io.dyj.jcartstoreback.po.Customer;
import io.dyj.jcartstoreback.service.CustomerService;
import io.dyj.jcartstoreback.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private JWTUtil jwtUtil;

    @PostMapping("/register")
    public Integer register(@RequestBody CustomerRegisterInDTO customerRegisterInDTO){
        Integer customerId = customerService.register(customerRegisterInDTO);
        return customerId;

    }



    @GetMapping("/getProfile")
    public CustomerGetProfileOutDTO getProfile(@RequestAttribute Integer customerId){
        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody CustomerUpdateProfileInDTO customerUpdateProfileInDTO,
                              @RequestAttribute Integer customerId){

    }

    @PostMapping("/changePwd")
    public void changePwd(@RequestBody CustomerChangePwdInDTO customerChangePwdInDTO,
                          @RequestAttribute Integer customerId){

    }

    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){
        return null;
    }

    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody CustomerResetPwdInDTO customerResetPwdInDTO){

    }



}
