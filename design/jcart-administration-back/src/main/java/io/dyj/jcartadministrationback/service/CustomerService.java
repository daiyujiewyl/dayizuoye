package io.dyj.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.dyj.jcartadministrationback.dto.in.CustomerSearchInDTO;
import io.dyj.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import io.dyj.jcartadministrationback.po.Customer;


public interface CustomerService {

    Page<Customer> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}
