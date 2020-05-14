package guru.springframework.spring5recipeapp.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp() {
        category = new Category();
    }

    @Test
    void getId() throws Exception {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    void getDescription() throws Exception {
        String description = "Test of Getting Description";
        category.setDescription(description);
        assertEquals(description, category.getDescription());
    }

    @Test
    void getRecipes() throws Exception {
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(new Recipe());
        category.setRecipes(recipes);
        assertEquals(recipes, category.getRecipes());
    }
}