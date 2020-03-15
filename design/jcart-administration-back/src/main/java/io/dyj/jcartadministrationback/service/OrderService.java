package io.dyj.jcartadministrationback.service;

        import com.github.pagehelper.Page;
        import io.dyj.jcartadministrationback.dto.in.OrderSearchInDTO;
        import io.dyj.jcartadministrationback.dto.out.OrderListOutDTO;
        import io.dyj.jcartadministrationback.dto.out.OrderShowOutDTO;

public interface OrderService {
    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);
}
