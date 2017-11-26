package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/***
 *  Created BY sdharma on 11/25/17
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
