package io.dyj.jcartadministrationback.service;

        import com.github.pagehelper.Page;
        import io.dyj.jcartadministrationback.dto.out.OrderListOutDTO;
        import io.dyj.jcartadministrationback.dto.out.OrderShowOutDTO;

public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);
}
