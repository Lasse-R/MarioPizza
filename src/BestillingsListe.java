import java.net.PortUnreachableException;
import java.util.ArrayList;

public class BestillingsListe {
    ArrayList<Bestilling> allOrders = new ArrayList<>();


    public void activeOrders(Bestilling orders){
        this.allOrders.add(orders);
    }

    public String getActiveOrders(){
        return "Aktive Bestillinger: " +"\n" + allOrders;
    }


}