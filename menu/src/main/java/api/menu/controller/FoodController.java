package api.menu.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import api.menu.dtos.FoodDto;
import api.menu.model.FoodModel;
import api.menu.repositories.FoodRepositories;

@RestController
@RequestMapping(value = "foods")
public class FoodController {

    @Autowired
    private FoodRepositories repository; 

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodDto> listAll(){

        List<FoodDto> foodsList = repository.findAll().stream().map(FoodDto::new).toList();
        return foodsList;
    }
}   
