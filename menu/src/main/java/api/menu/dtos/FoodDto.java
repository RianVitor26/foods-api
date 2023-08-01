package api.menu.dtos;

import api.menu.model.FoodModel;

public record FoodDto(Long id, String title, String image, Integer price ) {
    
    public FoodDto(FoodModel food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
