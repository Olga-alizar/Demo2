//14.04.2021
package com.example.demo.service;

import com.example.demo.entity.FurnitureSet;
import com.example.demo.repository.FurnitureSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureSetServiceImpl implements FurnitureSetService {

    private FurnitureSetRepository furnitureSetRepository;

    public FurnitureSetServiceImpl() {
    }

    @Autowired
    public FurnitureSetServiceImpl(FurnitureSetRepository furnitureSetRepository) {
        this.furnitureSetRepository = furnitureSetRepository;
    }

    @Override
    public List<FurnitureSet> getAllFurnitureSetWithJoin() {
        return furnitureSetRepository.getAllFurnitureSetWithJoin();
    }

    @Override
    public List<FurnitureSet> getAllFurnitureSet() {
        return furnitureSetRepository.getAllFurnitureSet();
    }


}

