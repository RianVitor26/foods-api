package api.menu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "foods")
public class FoodController {

    @GetMapping
    public String listAll(){
        return "foods";
    }
}
