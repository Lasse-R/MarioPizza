import java.util.ArrayList;

public class BestillingsListe {
    ArrayList<Bestilling> allOrders = new ArrayList<>();
    public void makeOrder(){
        Bestilling bestilling = new Bestilling();
        allOrders.add(bestilling);
    }


}
