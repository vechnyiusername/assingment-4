public class Main {
    public static void main(String[] args) {
        RecipeFactory mealFactory = new MealRecipeFactory();
        RecipeFactory drinkFactory = new DrinkRecipeFactory();

        Chef chef = new Chef(mealFactory);
        chef.cookRecipe("Spaghetti Bolognese");

        chef.setRecipeFactory(drinkFactory);
        chef.cookRecipe("Mojito");

        chef.setRecipeFactory(mealFactory);
        chef.cookRecipe("Chicken Curry");

        chef.setRecipeFactory(drinkFactory);
        chef.cookRecipe("Margarita");
    }
}
