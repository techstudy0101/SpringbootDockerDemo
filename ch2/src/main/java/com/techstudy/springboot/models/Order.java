package com.techstudy.springboot.models;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public String detail;

    public int unit;

}
