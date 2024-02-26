public class MealRecipeFactory extends RecipeFactory {
    @Override
    public Recipe createRecipe(String name) {
        return new MealRecipe(name);
    }
}
