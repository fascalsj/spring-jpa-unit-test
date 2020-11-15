package com.fascal.jpa.unittest.repository;

import com.fascal.jpa.unittest.entity.Item;
import com.fascal.jpa.unittest.entity.Promo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PromoRepository extends JpaRepository<Promo, Integer>, JpaSpecificationExecutor<Item> {
    @Query("SELECT p FROM Promo p")
    List<Item> findAllCustom();
}
