import java.net.PortUnreachableException;
import java.util.ArrayList;

public class BestillingsListe {
    ArrayList<Bestilling> allOrders = new ArrayList<>();
    Bestilling bestilling = new Bestilling();
    int counter = bestilling.giveBackCounter();


    public ArrayList activeOrders(Bestilling orders){
        allOrders.add(orders);


        return allOrders;
    }



    @Override
    public String toString() {
        return "BestillingsListe " + allOrders;
    }
}
