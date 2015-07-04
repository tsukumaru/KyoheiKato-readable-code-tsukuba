package recipe;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String recipeName;

    public Recipe(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeName() {
        return recipeName;
    }
}
