package io.dyj.jcartadministrationback.service;

import io.dyj.jcartadministrationback.po.Administrator;

public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    void update(Administrator administrator);
}
