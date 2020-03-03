package io.dyj.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.dyj.jcartstoreback.dto.out.ProductListOutDTO;
import io.dyj.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {
    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);
}
