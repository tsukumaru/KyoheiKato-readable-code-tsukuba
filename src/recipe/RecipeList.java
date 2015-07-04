package recipe;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RecipeList {
    private static final String RECIPE_DATA = "recipe-data.txt";

    private List<Recipe> recipeList;

    public RecipeList() {
        recipeList = new ArrayList<Recipe>();
    }

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public void readRecipeData() {
        try {
            File recipeDataFile = new File(RECIPE_DATA);
            FileReader fileReader = new FileReader(recipeDataFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String recipeName = bufferedReader.readLine();
            while (recipeName != null) {
                recipeList.add(new Recipe(recipeName));
                recipeName = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("100 - File Not Found " + e);
        } catch (IOException e) {
            System.out.println("100 - Can't Read File " + e);
        }
    }
}
