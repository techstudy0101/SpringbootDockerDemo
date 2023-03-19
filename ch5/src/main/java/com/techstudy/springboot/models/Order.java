package com.techstudy.springboot.models;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    public Integer id;

    public String detail;

    public int unit;

}
