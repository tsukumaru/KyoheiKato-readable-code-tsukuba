import recipe.OmeletRice;

public class Cooking {
    public static void main(String[] args) {
        echoRecipeName();
    }

    private static void echoRecipeName() {
        OmeletRice omeletRice = new OmeletRice();
        System.out.println(omeletRice.getRecipeName());
    }
}
