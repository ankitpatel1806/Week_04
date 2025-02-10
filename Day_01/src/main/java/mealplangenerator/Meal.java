package mealplangenerator;
// Generic class for handling Meal Plans
public class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public void displayMealDetails() {
        System.out.println(mealPlan.getMealDetails());
    }
}
