package lab13;


public class ProxyMealBuilder {

    MealBuilder bld;

    public ProxyMealBuilder() {
        bld = new MealBuilder();
    }

    public Meal prepareVegMeal (){
        return bld.prepareVegMeal();
    }
    public Meal prepareNonVegMeal (){
        return bld.prepareNonVegMeal();
    }
}