package io.dyj.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.dyj.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.dyj.jcartstoreback.dto.out.OrderShowOutDTO;
import io.dyj.jcartstoreback.po.Order;

public interface OrderService {
    Long  checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                     Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);
}
