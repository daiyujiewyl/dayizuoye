package io.dyj.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.dyj.jcartstoreback.po.Return;

public interface ReturnService {

    Integer create(Return ireturn);

    Page<Return> getPageByCustomerId(Integer customerId,Integer pageNum);

    Return getById(Integer returnId);



}
