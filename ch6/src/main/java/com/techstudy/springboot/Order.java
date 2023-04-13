package com.techstudy.springboot;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    public Integer id;

    public String detail;

    public int unit;

}
