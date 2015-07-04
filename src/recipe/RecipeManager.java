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

    public void showRecipeName(int id){
        Recipe recipe = recipeList.getRecipeList().get(id);
        System.out.println(recipe.getRecipeName());
    }

    public void showAllRecipeNames() {
        for (Recipe recipe : recipeList.getRecipeList()) {
            System.out.println(recipe.getRecipeName());
        }
    }

    public void showAllRecipeNamesWithId(){
        int id = 0;
        for (Recipe recipe : recipeList.getRecipeList()) {
            System.out.println(++id + " : " + recipe.getRecipeName());
        }
    }
}
