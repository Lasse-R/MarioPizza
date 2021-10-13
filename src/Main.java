public class Main {
    public static void main(String[] args) {
        Menukort menukort = new Menukort();
        BestillingsListe bestillingsListe = new BestillingsListe();
        Bestilling bestilling1 = new Bestilling();
        menukort.menuCreate();
        menukort.printMenu();

        bestilling1.addPizza(1);
        //System.out.println(bestilling1.getPizzasInOrder());

        Bestilling bestilling2 = new Bestilling();
        bestilling2.addPizza(4);

        bestillingsListe.activeOrders(bestilling1);
        bestillingsListe.activeOrders(bestilling2);




    }
}