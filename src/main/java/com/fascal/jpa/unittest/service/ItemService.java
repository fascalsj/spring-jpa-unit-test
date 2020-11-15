package com.fascal.jpa.unittest.service;

import com.fascal.jpa.unittest.entity.Item;
import com.fascal.jpa.unittest.repository.ItemRepository;
import com.fascal.jpa.unittest.repository.spec.ItemSpecication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> findAllByName(String name){
        return itemRepository.findAll(ItemSpecication.searchByItemNameLower("name"));
    }

}
