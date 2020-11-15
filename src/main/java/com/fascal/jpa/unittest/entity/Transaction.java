package com.fascal.jpa.unittest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String status;
    private Integer discount;
    private Integer totalGross;
    private Integer totalNet;

    @OneToMany(mappedBy = "transaction")
    List<Item> itemList;
}