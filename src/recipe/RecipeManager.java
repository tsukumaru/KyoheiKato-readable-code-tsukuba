package recipe;

public class RecipeManager {
    private RecipeList recipeList;

    public RecipeManager() {
        initRecipeList();
    }

    private void initRecipeList() {
        recipeList = new RecipeList();
        recipeList.readRecipeData();
    }

    public void showRecipeNames() {
        for (Recipe recipe : recipeList.getRecipeList()) {
            System.out.println(recipe.getRecipeName());
        }
    }
}
