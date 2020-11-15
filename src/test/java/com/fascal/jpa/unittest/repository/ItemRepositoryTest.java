package com.fascal.jpa.unittest.repository;

import com.fascal.jpa.unittest.entity.Item;
import com.fascal.jpa.unittest.repository.spec.ItemSpecication;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void jpaTestCoba() {


        // given
        Item item = new Item();
        item.setName("Nama");
        item.setDescription("Deskripsi");
        item.setPrice(50000);
        item.setTitle("Judul");

        itemRepository.save(item);

        // given
        Item item2 = new Item();
        item2.setName("Fascal");
        item2.setDescription("Deskripsi");
        item2.setPrice(50000);
        item2.setTitle("Judul");
        itemRepository.save(item2);

        List<Item> itemList = itemRepository.findAll(ItemSpecication.searchByItemNameLower("nama"));

        Assert.assertEquals(1, itemList.size());
        Assert.assertEquals(1, itemList.get(0).getId(), 0);
        Assert.assertEquals(item.getName(), itemList.get(0).getName());
        Assert.assertEquals(item.getDescription(), itemList.get(0).getDescription());
        Assert.assertEquals(item.getPrice(), itemList.get(0).getPrice());
        Assert.assertEquals(item.getTitle(), itemList.get(0).getTitle());

    }


}