import recipe.Recipe;
import recipe.RecipeList;
import recipe.RecipeManager;

public class Cooking {
    public static void main(String[] args) {
        displayRecipeNames();
    }

    private static void displayRecipeNames() {
        RecipeManager recipeManager = new RecipeManager();

        recipeManager.showRecipeNamesWithId();
    }
}