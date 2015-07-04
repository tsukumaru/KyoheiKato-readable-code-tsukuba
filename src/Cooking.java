import recipe.Recipe;
import recipe.RecipeList;
import recipe.RecipeManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cooking {
    public static void main(String[] args) {
        displayRecipeNames();
    }

    private static void displayRecipeNames(){
        RecipeManager recipeManager = new RecipeManager();

        System.out.println("レシピのIDを入力してください(0 -> 全てのレシピ)");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int id = Integer.parseInt(br.readLine());
            if(--id < 0)
                recipeManager.showAllRecipeNamesWithId();
            else
                recipeManager.showRecipeName(id);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}