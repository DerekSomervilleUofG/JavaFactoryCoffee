import java.util.ArrayList;

abstract public class Coffee {

    private String name;
    private int milkAmount;
    private int waterAmount;
    private int coffeeAmount;
    private int cupType;

    public String getName(){
        return name;
    }

    private ArrayList<Integer> getIngredients(){
        ArrayList<Integer> listOfIngredients = new ArrayList<Integer>();
        listOfIngredients.add(milkAmount);
        listOfIngredients.add(waterAmount);
        listOfIngredients.add(coffeeAmount);
        return listOfIngredients;
    }

    public void prepare(){
        System.out.println("Prepare - get ingredients for " + getName());
        ArrayList<Integer> ingredients = getIngredients();
    }

    public Cup getCoffeeCup() {
        System.out.println("Get coffee cup for " + getName());
        Cup cup = new Cup(cupType);
        return cup;
    }

    public void pourCoffee(){
        System.out.println("Pour " + getName());

    }

    public void serve(){}
}
