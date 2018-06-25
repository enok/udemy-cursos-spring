package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by enok on 25/06/2018
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
