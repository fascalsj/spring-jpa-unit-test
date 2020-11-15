package com.fascal.jpa.unittest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Promo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String promoName;
    private Integer discountPercentage;
    private Integer discountNominal;

    @ManyToOne()
    private Item item;
}