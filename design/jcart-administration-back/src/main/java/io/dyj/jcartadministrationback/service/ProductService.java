package io.dyj.jcartadministrationback.service;

import io.dyj.jcartadministrationback.dto.in.ProductCreateInDTO;



public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);
}
