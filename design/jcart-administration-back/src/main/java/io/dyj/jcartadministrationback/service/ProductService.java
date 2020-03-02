package io.dyj.jcartadministrationback.service;

import io.dyj.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.dyj.jcartadministrationback.dto.in.ProductUpdateInDTO;

import java.util.List;


public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);
}
