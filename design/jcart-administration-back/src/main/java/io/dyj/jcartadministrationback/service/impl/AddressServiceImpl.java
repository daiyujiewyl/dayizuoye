package io.dyj.jcartadministrationback.service.impl;

import io.dyj.jcartadministrationback.dao.AddressMapper;
import io.dyj.jcartadministrationback.po.Address;
import io.dyj.jcartadministrationback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;


    @Override
    public Address getById(Integer addressId) {
        Address address = addressMapper.selectByPrimaryKey(addressId);
        return address;
    }
}
