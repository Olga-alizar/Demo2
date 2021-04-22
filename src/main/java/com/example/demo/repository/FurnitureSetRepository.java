//08.04.2021
package com.example.demo.repository;

import com.example.demo.entity.FurnitureSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FurnitureSetRepository  extends JpaRepository<FurnitureSet, Integer > {

    @Query("SELECT c FROM furniture_set c")
    List<FurnitureSet> getAllFurniture_Set();

    @Query("SELECT c FROM furniture_set c LEFT JOIN FETCH c.compositions")
    public List<FurnitureSet> getAllFurniture_SetWithJoin();
    //public List<FurnitureSet>
}
