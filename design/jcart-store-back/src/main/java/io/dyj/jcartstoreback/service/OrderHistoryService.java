package io.dyj.jcartstoreback.service;

import io.dyj.jcartstoreback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {
    List<OrderHistory> getByOrderId(Long orderId);
}
