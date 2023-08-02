package api.menu.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.menu.dtos.FoodRequestDTO;
import api.menu.dtos.FoodResponseDTO;
import api.menu.model.FoodModel;
import api.menu.repositories.FoodRepositories;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "foods")
public class FoodController {

    @Autowired
    private FoodRepositories repository;

    @GetMapping
    public List<FoodResponseDTO> listAll() {

        List<FoodResponseDTO> foodsList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodsList;
    }

    @PostMapping
    public void create(@RequestBody FoodRequestDTO data) {
        FoodModel foodData = new FoodModel(data);
        repository.save(foodData);
        return;
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id) {
        FoodModel existingFood = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Food not found"));

        repository.delete(existingFood);
    }
}
