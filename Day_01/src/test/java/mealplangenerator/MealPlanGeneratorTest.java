package mealplangenerator;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MealPlanGeneratorTest {

    @Test
    public void testGenerateMealPlanForVegetarian() {
        // Creating a sample vegetarian meal
        VegetarianMeal vegetarianMeal = new VegetarianMeal("Vegetable Stir Fry");

        // Generating the meal plan using the generic method
        Meal<VegetarianMeal> meal = MealPlanGenerator.generateMealPlan(vegetarianMeal);

        // Validating that the generated meal plan is correct
        assertNotNull(meal);
        assertEquals("Vegetarian Meal: Vegetable Stir Fry", meal.getMealPlan().getMealDetails());
    }

    @Test
    public void testGenerateMealPlanForVegan() {
        // Creating a sample vegan meal
        VeganMeal veganMeal = new VeganMeal("Vegan Burrito");

        // Generating the meal plan using the generic method
        Meal<VeganMeal> meal = MealPlanGenerator.generateMealPlan(veganMeal);

        // Validating that the generated meal plan is correct
        assertNotNull(meal);
        assertEquals("Vegan Meal: Vegan Burrito", meal.getMealPlan().getMealDetails());
    }


}

