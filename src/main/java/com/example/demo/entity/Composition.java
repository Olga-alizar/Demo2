//12-15,20.04.2021
package com.example.demo.entity;
import org.springframework.data.util.Lazy;

import javax.persistence.*;

import java.util.List;

@Entity
public class Composition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    Integer furniture_set_id;

    @Column
    Integer furniture_id;

    @Column
    String name;

    @Column
    Integer quantity;

    @Column
    String description;

    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "furniture_set_id", insertable = false, updatable = false)
    FurnitureSet furniture_set;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "furniture_id", insertable = false, updatable = false)
    Furniture furniture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Composition{" +
                "id=" + id +
                ", furniture_set_id=" + furniture_set_id +
                ", furniture_id=" + furniture_id +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }
}
