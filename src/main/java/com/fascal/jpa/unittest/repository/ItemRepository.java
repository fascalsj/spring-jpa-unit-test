package com.fascal.jpa.unittest.repository;

import com.fascal.jpa.unittest.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer>, JpaSpecificationExecutor<Item> {
    @Query("SELECT i FROM Item i")
    List<Item> findAllCustom();
}
