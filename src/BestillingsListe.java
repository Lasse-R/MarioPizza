import java.net.PortUnreachableException;
import java.util.ArrayList;

public class BestillingsListe {
    ArrayList<Bestilling> allOrders = new ArrayList<>();


    public ArrayList activeOrders(Bestilling orders){
        allOrders.add(orders);


        return allOrders;
    }

    @Override
    public String toString() {
        return "BestillingsListe: " + allOrders;
    }
}
