public class Main {
    public static void main(String[] args) {
        Menukort menukort = new Menukort();
        Bestilling bestilling1 = new Bestilling();
        menukort.menuCreate();
        menukort.printMenu();

        bestilling1.addPizza(1);
        bestilling1.addPizza(5);
        bestilling1.addPizza(18);
        System.out.println(bestilling1.getPizzasInOrder());


    }
}