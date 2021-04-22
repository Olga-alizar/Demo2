//14.04.2021
package com.example.demo.service;

import com.example.demo.entity.FurnitureSet;
import com.example.demo.repository.FurnitureSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureSetServiceImpl implements FurnitureSetService {

    private final FurnitureSetRepository furnitureSetRepository;

    @Autowired
    public FurnitureSetServiceImpl(FurnitureSetRepository furnitureSetRepository) {
        this.furnitureSetRepository = furnitureSetRepository;
    }
/*
    @Override
    public List<FurnitureSet> getAllFurnitureSetsWithFurnitures() {
        return furnitureSetRepository.getAllFurnitureSetWithJoin();
    }
*/

    @Override
    public List<FurnitureSet> getAllFurniture_Sets() {
        return furnitureSetRepository.getAllFurniture_Set();
    }
}

