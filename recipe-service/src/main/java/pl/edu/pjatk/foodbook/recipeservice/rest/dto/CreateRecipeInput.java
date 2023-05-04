package pl.edu.pjatk.foodbook.recipeservice.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.edu.pjatk.foodbook.recipeservice.repository.model.Macros;
import pl.edu.pjatk.foodbook.recipeservice.repository.model.Product;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateRecipeInput {
    // todo valid
    private String name;
    private String recipe;
    private List<Product> products;
    private Macros macros;
    private String mainProducts;
    private String description;
}

