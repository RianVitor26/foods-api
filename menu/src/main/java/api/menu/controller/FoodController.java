package api.menu.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import api.menu.model.FoodModel;
import api.menu.repositories.FoodRepositories;

@RestController
@RequestMapping(value = "foods")
public class FoodController {

    @Autowired
    private FoodRepositories repository; 

    @GetMapping
    public List<FoodModel> listAll(){

        List<FoodModel> foodsList = repository.findAll();
        return foodsList;
    }
}
