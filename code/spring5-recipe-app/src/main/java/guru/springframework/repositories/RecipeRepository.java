package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by enok on 22/06/2018
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
