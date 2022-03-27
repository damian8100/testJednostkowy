package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCT")

public class Product {

    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();


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
    @OneToMany
            (cascade = CascadeType.ALL)
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
