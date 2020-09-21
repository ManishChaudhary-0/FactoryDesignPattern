package cakeoptions;

public class carrotCake extends Cake {
    //Constructor that hold the variables to create a CarrotCake
    public carrotCake(){
        name = "Carrot Cake";
        price = 54.99;
        numLayers = 2;
        shape = Shape.ROUND;
        flavor = "Carrot";
        icing = "Cream Cheese";
        decorations.add("Walnuts");
        decorations.add("Candy Carrots");

    }
}
