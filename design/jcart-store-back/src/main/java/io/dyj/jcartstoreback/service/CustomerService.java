package io.dyj.jcartstoreback.service;

import io.dyj.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.dyj.jcartstoreback.po.Customer;



public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    Customer getByEmail(String email);

    void update(Customer customer);

}
