package one.thirdprogram;

public class Main {

    public static void main(String[] args) {

        CoffeeMaker coffee = new CoffeeMaker(true,true,true);
        DishWasher dish = new DishWasher(true,true,true);
        Refrigerator fridge = new Refrigerator(true,true,true);

        SmartKitchen sk = new SmartKitchen(true,true,coffee,dish,fridge);
        sk.addWater();

        sk.dishWasher.doDishes();
    }
}
