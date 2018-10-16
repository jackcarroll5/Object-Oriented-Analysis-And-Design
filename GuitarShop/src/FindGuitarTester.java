import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, NumString.TWELVESTRING, Wood.ALDER,Wood.ALDER);

       List<Guitar> guitar = inventory.searchSimple(whatLookingFor);


        if (guitar != null){
            System.out.println("You might like these: ");

            for (Iterator i = guitar.iterator(); i.hasNext();)
            {
                Guitar guitarSelect = (Guitar) i.next();
                GuitarSpec spec = guitarSelect.getGuitarSpec();
            System.out.println("\nWe have: \nBuilder: " + spec.getBuilder() + " \nModel: " +
                    spec.getModel() + " \nType: " + spec.getType()
                    + " \nNo of Strings: " + spec.getNumStrings() + " \nBackwood: " + spec.getBackwood()
                    + " \nTopwood: " + spec.getTopwood()
                    + " \n" + "Guitar price: €" + guitarSelect.getPrice() + "\nGuitar Serial No: " + guitarSelect.getSerialNumber()); //and whatever other details you desire
            }
        }
        else {
            System.out.println("Sorry, we have nothing for you.");
        }
    }

    public static void initialiseInventory(Inventory inventory){
        //add guitars to the inventory

        GuitarSpec spec = new GuitarSpec(Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                NumString.TWELVESTRING,
                Wood.ALDER,
                Wood.ALDER);

        inventory.addGuitar("V00001",1499.99,spec);

            spec = new GuitarSpec(Builder.MARTIN,
                "Stratocastor",
                Type.ACOUSTIC,
                NumString.TWELVESTRING,
                Wood.ALDER,
                Wood.ALDER);

        inventory.addGuitar("V00002",1199.99,spec);

        spec = new GuitarSpec(Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                NumString.SIXSTRING,
                Wood.ALDER,
                Wood.ALDER);

        inventory.addGuitar("V00003",1699.99,spec);

        spec = new GuitarSpec(Builder.COLLINGS,
                "Stratocastor",
                Type.ELECTRIC,
                NumString.SIXSTRING,
                Wood.ALDER,
                Wood.ALDER);

        inventory.addGuitar("V00004",1799.99,spec);

        //inventory.getGuitar("V00001");
        spec = new GuitarSpec(Builder.GIBSON,
                "Stratocastor",
                Type.ELECTRIC,
                NumString.SIXSTRING,
                Wood.CEDAR,
                Wood.ALDER);

        inventory.addGuitar("",0,spec);

    }
}
