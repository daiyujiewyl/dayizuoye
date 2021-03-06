package io.dyj.jcartadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.dyj.jcartadministrationback.dao.ReturnMapper;
import io.dyj.jcartadministrationback.po.Return;
import io.dyj.jcartadministrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnServiceImpl implements ReturnService {
    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public Page<Return> search(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<Return> page = returnMapper.search();
        return page;
    }

    @Override
    public Return getById(Integer returnId) {
        Return aReturn = returnMapper.selectByPrimaryKey(returnId);
        return aReturn;
    }

    @Override
    public void update(Return aReturn) {
        returnMapper.updateByPrimaryKeySelective(aReturn);
    }
}
