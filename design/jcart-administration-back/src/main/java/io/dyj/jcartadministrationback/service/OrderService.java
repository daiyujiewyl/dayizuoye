package io.dyj.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.dyj.jcartadministrationback.dto.out.OrderListOutDTO;

public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);
}
