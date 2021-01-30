package com.aurora.crawler.dao;

import com.aurora.crawler.pojo.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDao extends JpaRepository<Item,Long> {
}
