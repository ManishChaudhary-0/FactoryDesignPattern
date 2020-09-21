package cakeoptions;

public class birthdayCake extends Cake{
    //Constructor that hold the variables to create a BirthdayCake
    public birthdayCake(){
        name = "Birthday Cake";
        price = 109.99;
        numLayers = 1;
        shape = Shape.SHEET;
        flavor = "Funfetti";
        icing = "Vanilla";
        decorations.add("Sprinkles");
        decorations.add("Candy Flowers");
        decorations.add("Icing Writing");
    }
}
