//0, 10.04.2021
package com.example.demo;

import com.example.demo.entity.FurnitureSet;
import com.example.demo.repository.FurnitureSetRepository;
import com.example.demo.service.FurnitureSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {

	@Autowired
	private FurnitureSetService furnitureSetService;
	//FurnitureSetRepository furnitureSetRepository;

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

    @Override
	public void run(String...  args) throws Exception {
        // List<FurnitureSet> furnitureSetList = furnitureSetRepository.getAllFurnitureSet();
		List<FurnitureSet> furnitureSetList = furnitureSetService.getAllFurnitureSetWithJoin();
         for (FurnitureSet furnitureset: furnitureSetList) {
         	System.out.println(furnitureset);
		 }
	}
}
