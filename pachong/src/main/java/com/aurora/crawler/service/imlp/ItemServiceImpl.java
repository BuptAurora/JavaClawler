package com.aurora.crawler.service.imlp;

import com.aurora.crawler.service.ItemService;
import com.aurora.crawler.dao.ItemDao;
import com.aurora.crawler.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Override
    public void save(Item item) {
        this.itemDao.save(item);
    }

    @Override
    public List<Item> findAll(Item item) {
        // 声明查询条件
        Example<Item> example = Example.of(item);
        // 根据查询条件进行查询数据
        List<Item> list = this.itemDao.findAll(example);
        return list;
    }
}
