package io.dyj.jcartadministrationback.service;

import io.dyj.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.dyj.jcartadministrationback.dto.in.ProductUpdateInDTO;


public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);
}
