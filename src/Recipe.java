import java.util.ArrayList;
import java.util.List;

public abstract class Recipe {
    protected String name;
    protected List<Ingredient> ingredients;

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public abstract void cook();

    public String getName() {
        return name;
    }
}
