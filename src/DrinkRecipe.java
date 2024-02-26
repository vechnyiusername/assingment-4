public class DrinkRecipe extends Recipe {
    public DrinkRecipe(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("Mixing " + name + "...");
        // Implement mixing process for drink recipe
    }
}
