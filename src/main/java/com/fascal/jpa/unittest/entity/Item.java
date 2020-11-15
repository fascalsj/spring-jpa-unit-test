package com.fascal.jpa.unittest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String title;
    private String description;
    private Integer price;

    @OneToMany(mappedBy = "item",fetch = FetchType.LAZY)
    private List<Promo> promoList;

    @ManyToOne
    private Transaction transaction;
}