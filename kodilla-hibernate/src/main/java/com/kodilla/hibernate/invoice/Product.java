package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")

public class Product {

    private int id;
    private String name;
    private Item item;


    public Product (){

    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Id
    @NotNull
    @Column(name="ID")
    public int getId() {
        return id;
    }
    @NotNull
    @Column(name="NAME")
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
