//14.04.2021
package com.example.demo.service;

import com.example.demo.entity.FurnitureSet;
import com.example.demo.repository.FurnitureSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FurnitureSetService {
    
    public List<FurnitureSet> getAllFurnitureSet() ;
    public List<FurnitureSet> getAllFurnitureSetWithJoin();
}
