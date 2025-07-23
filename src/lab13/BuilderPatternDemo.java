package lab13;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        ProxyMealBuilder mealBuilder = new ProxyMealBuilder();

        int[]arr = new int[7];
        int h =  arr.length;

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal:");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal:");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}