package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 *  Created BY sdharma on 11/22/17
 */
@Slf4j
@Controller
public class IndexController {
    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/", "", "/index"})
    public String getIndexPage(Model model) {
/*        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Pinch");
        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("UOM Id is: " + unitOfMeasureOptional.get().getId());*/
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
/*    @RequestMapping("/guacamole")
    public String getGuacamolePage(Model model) {
        log.debug("In Guacamol page");
        model.addAttribute("recipe", recipeRepository.findById(1L).get());
        return "guacamole";
    }
    @RequestMapping("/chickenTacos")
    public String getChickenTacosPage(Model model) {
        log.debug("In Chicken Tacos page");
        //model.addAttribute("recipes", recipeRepository.findById(2L).get());
        return "chickenTacos";
    }*/
}
