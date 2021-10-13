public class Bestilling {
    static int statiskBestillingCounter = 0;
    private int counterForObject;
    public Bestilling(){
        statiskBestillingCounter++;
        counterForObject = statiskBestillingCounter;
    }



    public int giveBackCounter(){
        return counterForObject;
    }

}
