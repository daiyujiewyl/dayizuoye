package io.dyj.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.dyj.jcartstoreback.dto.out.ProductListOutDTO;
import io.dyj.jcartstoreback.dto.out.ProductShowOutDTO;
import io.dyj.jcartstoreback.po.Product;

public interface ProductService {
    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);
}
