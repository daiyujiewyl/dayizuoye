package io.dyj.jcartadministrationback.service;

import io.dyj.jcartadministrationback.po.Administrator;

public interface AdministratorService {

    Administrator getByUsername(String username);
}
