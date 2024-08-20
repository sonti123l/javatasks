package one.thirdprogram;

public class SmartKitchen extends Kitchen{

    //values
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(boolean isKitchenClean, boolean isWifeAtKitchen,CoffeeMaker brewMaster,DishWasher dishWasher,Refrigerator iceBox){
        super(isKitchenClean,isWifeAtKitchen);
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    //addWater method
    public void addWater(){
        System.out.println("water is added into bowl");
    }

    //pourMilk
    public void pourMilk(){
        System.out.println("bowl got heated, We add the milk into bowl");
    }

    //loadDishWasher
    public void loadDishWasher(){
        System.out.println("dish wsher is loaded");
    }

    public void setKitchenState(boolean dishWasherState,boolean coffeeGotCleaner,boolean kitchenStateChecker){
        if(dishWasherState&&coffeeGotCleaner&&kitchenStateChecker){
            System.out.println("the state of the kitchen got clean");
        }
        else{
            System.out.println("the state of the kitchen got notClean"+
                    "there is lot more work");
        }
    }
}
