import java.util.ArrayList;

public class Arkiv {
    private ArrayList<Bestilling> allArchivedOrders = new ArrayList<>();
    private static Arkiv INSTANCE;
    private String info = "Initial info class";


    private Arkiv() {
    }

    public static Arkiv getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Arkiv();
        }
        return INSTANCE;
    }






}
