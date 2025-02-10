package mealplangenerator;
public class MealPlanGenerator {
    // Generic method to validate and generate meal plans
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        // Example validation (could be expanded with more rules)
        if (mealPlan == null) {
            throw new IllegalArgumentException("Meal plan cannot be null.");
        }

        // Return the Meal object containing the validated meal plan
        return new Meal<>(mealPlan);
    }

}
