//14,21.04.2021
package com.example.demo.entity;

import javax.persistence.*;

import java.util.Set;

@Entity
public class Furniture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String name;
    @Column
    String description;

    @ManyToMany(mappedBy = "furnitureList")
//    Set<Composition> compositionSet;
/*
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "composition",
            joinColumns = { @JoinColumn(name = "furniture_set_id") },
            inverseJoinColumns = { @JoinColumn(name = "furniture_id")})
*/
   private Set<FurnitureSet> furnitureSet ;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
