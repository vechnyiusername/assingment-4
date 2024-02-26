public class MealRecipe extends Recipe {
    public MealRecipe(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("Cooking " + name + "...");
        // Implement cooking process for meal recipe
    }
}
