package one.thirdprogram;

import java.sql.SQLOutput;

public class Kitchen {

    //Two attributes
    private boolean isKitchenClean;
    private boolean isWifeAtKitchen;

    //constructor
    public Kitchen(boolean isKitchenClean,boolean isWifeAtKitchen){
        this.isKitchenClean = isKitchenClean;
        this.isWifeAtKitchen = isWifeAtKitchen;
    }

}

//Refrigerator inherited class
class Refrigerator extends Kitchen {

    private boolean hasWorkToDo;

    //public constructor
    public Refrigerator(boolean isKitchenClean, boolean isWifeAtKitchen, boolean hasWorkToDo) {
        super(isKitchenClean, isWifeAtKitchen);
        this.hasWorkToDo = hasWorkToDo;
    }

    //getter method
    public boolean getHasWorkTODo(){
        return hasWorkToDo;
    }

    public void orderFood(){
        System.out.println("Food is getting ordered");
    }

}

//DishWasher
class DishWasher extends Kitchen {

    private boolean hasWorkToDo;

    //public constructor
    public DishWasher(boolean isKitchenClean, boolean isWifeAtKitchen, boolean hasWorkToDo) {
        super(isKitchenClean, isWifeAtKitchen);
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        System.out.println("the dishes are getting ready");
    }

    //getter method
    public boolean getHasWorkToDO(){
        return hasWorkToDo;
    }
}

class CoffeeMaker extends Kitchen {

    private boolean hasWorkToDo;

    //public constructor
    public CoffeeMaker(boolean isKitchenClean, boolean isWifeAtKitchen, boolean hasWorkToDo) {
        super(isKitchenClean, isWifeAtKitchen);
        this.hasWorkToDo = hasWorkToDo;
    }

    //method brewCoffee
    public void brewCoffee(){
        System.out.println("the coffee is getting started to add ingrediants");
    }

    public boolean getHasWorkToDO(){
        return hasWorkToDo;
    }
}



