package io.dyj.jcartstoreback.service.impl;

import io.dyj.jcartstoreback.dao.ReturnMapper;
import io.dyj.jcartstoreback.po.Return;
import io.dyj.jcartstoreback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnServiceImpl implements ReturnService {

    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public Integer create(Return ireturn) {
        returnMapper.insertSelective(ireturn);
        Integer returnId = ireturn.getReturnId();
        return returnId;
    }
}
