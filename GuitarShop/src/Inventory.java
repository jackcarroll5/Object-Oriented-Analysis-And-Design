import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private LinkedList<Guitar> guitars;

    public Inventory(){
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec){
        //Guitar guitar = new Guitar(serialNumber, price, model, type, builder, backwood , topwood);
        Guitar guitar = new Guitar(serialNumber,price,spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator<Guitar> i = guitars.iterator(); (i).hasNext();)
        {
            Guitar guitar = i.next();
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    //Show lists
    public List <Guitar> searchSimple(GuitarSpec searchGuitar)
    {
        List<Guitar> matchGuitars = new LinkedList<Guitar>();

        for (Iterator i = guitars.iterator(); i.hasNext();)
        {
            Guitar guitar = (Guitar) i.next();
            //ignore serialNumber since it is unique
            //ignore price since it is unique

            GuitarSpec guitarSpec = guitar.getGuitarSpec();

            if(guitar.getGuitarSpec().matches(guitarSpec))
            {
                matchGuitars.add(guitar);
            }
        }
        return matchGuitars;
    }
}
