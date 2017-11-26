package guru.springframework.controllers;

import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.RecipeRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 *  Created BY sdharma on 11/22/17
 */
@Controller
public class IndexController {
    private CategoryRepository categoryRepository;

    private UnitOfMeasureRepository unitOfMeasureRepository;

    private RecipeRepository recipeRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository, RecipeRepository recipeRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.recipeRepository = recipeRepository;
    }

    @RequestMapping({"/", "", "/index"})
    public String getIndexPage() {
/*        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Pinch");
        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("UOM Id is: " + unitOfMeasureOptional.get().getId());*/
        return "index";
    }
    @RequestMapping("/guacamole")
    public String getGuacamolePage(Model model) {
        model.addAttribute("recipe", recipeRepository.findById(1L).get());
        return "guacamole";
    }
    @RequestMapping("/chickenTacos")
    public String getChickenTacosPage(Model model) {
        //model.addAttribute("recipes", recipeRepository.findById(2L).get());
        return "chickenTacos";
    }
}
