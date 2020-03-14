package io.dyj.jcartadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.dyj.jcartadministrationback.dao.OrderDetailMapper;
import io.dyj.jcartadministrationback.dao.OrderMapper;
import io.dyj.jcartadministrationback.dto.out.OrderListOutDTO;
import io.dyj.jcartadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public Page<OrderListOutDTO> search(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<OrderListOutDTO> page=orderMapper.search();
        return page;
    }
}
