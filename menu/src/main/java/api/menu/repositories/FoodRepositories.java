package api.menu.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import api.menu.model.FoodModel;

public interface FoodRepositories extends JpaRepository<FoodModel, Long> {
    
}
