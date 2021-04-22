//-14,15,20.04.2021
package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "furniture_set")
public class FurnitureSet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer price;

    @Column
    private String description;
/*
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "furniture_set_id")
    private Passport passport;
*/

    @OneToMany(mappedBy = "furniture_set", fetch = FetchType.EAGER)
    Set<Composition> compositions;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)

    @JoinTable(name = "composition",
            joinColumns = { @JoinColumn(name = "furniture_set_id") },
            inverseJoinColumns = { @JoinColumn(name = "furniture_id")})
    List<Furniture> furnitureList;

/*
    @OneToMany(mappedBy = "furniture_set_id", fetch = FetchType.EAGER)

          //List<Furniture> furnitureList;
             List<Composition> compositions;
 */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {this.price = price;  }

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
        return "Furniture_set{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description +
                '}';
    }
}
