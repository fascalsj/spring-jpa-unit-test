package com.fascal.jpa.unittest.repository.spec;

import com.fascal.jpa.unittest.entity.Item;
import org.springframework.data.jpa.domain.Specification;

public class ItemSpecication {

    public static Specification<Item> searchByItemNameLower(String name) {
        return ((item, query, criteriaBuilder) -> criteriaBuilder.like(
                criteriaBuilder.lower(
                        item.get("name")
                ), "%" + name.toLowerCase() + "%"
        )
        );
    }
}
