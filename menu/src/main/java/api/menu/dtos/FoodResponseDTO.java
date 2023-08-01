package api.menu.dtos;

import api.menu.model.FoodModel;

public record FoodResponseDTO(Long id, String title, String image, Integer price ) {
    
    public FoodResponseDTO(FoodModel food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
