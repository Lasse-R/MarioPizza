public class PM2000 {

    public void startProgram() {
        Menukort menukort = new Menukort();
        BestillingsListe bestillingsListe = new BestillingsListe();
        Arkiv theArchive = Arkiv.getInstance();

        boolean runningFlag = true;
        while (runningFlag) {
            System.out.println("PizzaMachine2000 is starting");

        }

        //System.out.println(bestilling1.getPizzasInOrder());
        /*
        Bestilling bestilling2 = new Bestilling();
        bestilling2.addPizza(4);

        bestillingsListe.activeOrders(bestilling1);
        bestillingsListe.activeOrders(bestilling2);

        int bestillingsNummer = 3;


        for (int i = 0; i < bestillingsListe.allOrders.size(); i++) {
            if (bestillingsListe.allOrders.get(i).giveBackCounter() == bestillingsNummer) {
                System.out.println("fandt denne");
                System.out.println(bestillingsListe.allOrders.get(i));

                bestillingsListe.allOrders.remove(i);
            }


        }
*/


    }

    public static void main(String[] args) {
        PM2000 pmrunTime = new PM2000();
        pmrunTime.startProgram();
    }
}










