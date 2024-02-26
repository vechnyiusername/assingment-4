public class Chef {
    private RecipeFactory recipeFactory;

    public Chef(RecipeFactory recipeFactory) {
        this.recipeFactory = recipeFactory;
    }

    public void cookRecipe(String name) {
        Recipe recipe = recipeFactory.createRecipe(name);
        if (recipe != null) {
            recipe.cook();
        } else {
            System.out.println("Recipe not found.");
        }
    }
}
