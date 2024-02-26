public class DrinkRecipeFactory extends RecipeFactory {
    @Override
    public Recipe createRecipe(String name) {
        return new DrinkRecipe(name);
    }
}
