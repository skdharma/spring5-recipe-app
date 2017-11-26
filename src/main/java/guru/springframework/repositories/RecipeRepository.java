package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/***
 *  Created BY sdharma on 11/23/17
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
