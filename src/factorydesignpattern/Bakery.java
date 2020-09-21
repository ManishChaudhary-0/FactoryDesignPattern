package factorydesignpattern;

import cakeoptions.birthdayCake;
import cakeoptions.blackForestCake;
import cakeoptions.Cake;
import cakeoptions.carrotCake;

public class Bakery extends Cake {
    // creates a cake based on String type and return the price of the desired cake
    public Cake orderCake(String type){
        Cake cake = createCake(type);
        cake.createCake();
        System.out.println("Price: " + cake.getPrice());
        return cake;
    }

    // Method to create and return a cake
    private Cake createCake(String type){
        if(type.equalsIgnoreCase("carrot cake")){
            return new carrotCake();
        }
        else if (type.equalsIgnoreCase("black forest cake")){
            return new blackForestCake();
        }
        else if (type.equalsIgnoreCase("birthday cake")){
            return new birthdayCake();
        }
        return createCake(type);

    }

}
