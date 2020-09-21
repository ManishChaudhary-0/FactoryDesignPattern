package cakeoptions;

import java.util.ArrayList;

// Inserting Cakes variables
public abstract class Cake {
    protected String name;
    protected double price;
    protected int numLayers;
    protected ArrayList<String> decorations;
    protected Shape shape;
    protected String flavor;
    protected String icing;

    // Cake constructor holding the decorations ArrayList
    public Cake(){
        decorations = new ArrayList<>();
    }

    // method to create a cake, calls 3 methods
    public void createCake(){
        createLayers();
        frostCake();
        addDecorations();
    }

    // Method to display a message containing the flavor and layering of the specific cake
    private void createLayers(){
        if (shape == Shape.CUPCAKES){
            System.out.println("Creating a " + flavor + " cupcakes");
        }
        else if (shape == Shape.BUNT){
            System.out.println("Creating a " + flavor + " bunt cake");
        }
        else if (shape == Shape.SHEET || numLayers == 1 && shape == Shape.ROUND){
            System.out.println("Creating a 2 layer " + shape + " " + flavor + " cake");
        }
        else if (numLayers > 1 && (shape == Shape.ROUND || shape == Shape.SHEET)){
            System.out.println("Creating a " + numLayers + " layered " + shape + " " + flavor + " cake" );
        }
    }

    //Outputs the icing for the cake
    private void frostCake(){
        System.out.println("Frost cake with " + icing + " icing");
    }

    // Outputs the decorations on each cake
    private void addDecorations() {

        for (String dec : decorations) {
            System.out.println("Adding " + dec);
        }
    }

    public double getPrice(){
        return price;
    }
}
