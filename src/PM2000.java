import java.sql.SQLOutput;
import java.util.Scanner;

public class PM2000 {
    Scanner scanner = new Scanner(System.in);
    Menukort menukort = new Menukort();
    BestillingsListe bestillingsListe = new BestillingsListe();
    Arkiv theArchive = Arkiv.getInstance();

    public void startProgram() {


        boolean runningFlag = true;
        System.out.println("PizzaMachine2000 is starting");
        while (runningFlag) {
            System.out.println("""
                    MENU:
                    Ny bestilling
                    Bestillinger
                    Arkiv
                    Menukort""");
            if (scanner.hasNextLine()) {
                String userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("ny bestilling")) {
                    System.out.println();
                    newOrder();
                }
                if (userInput.equalsIgnoreCase("bestillinger")) {
                    doneOrder();
                }
                if (userInput.equalsIgnoreCase("arkiv")) {
                    archive();
                }
                if (userInput.equalsIgnoreCase("menukort")) {
                    menuCard();
                }
            } else {
                System.out.println("Try again");
            }
        }
            /*
            //System.out.println(bestilling1.getPizzasInOrder());

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

             */
    }


    public static void main(String[] args) {
        PM2000 pmrunTime = new PM2000();
        pmrunTime.startProgram();
    }

    public void newOrder() {//Opretter ny bestilling
        boolean isOrderDone = false;

        do {

            System.out.println("Hvilken pizza vil du tilføje?");
            String answer = scanner.nextLine();
            Bestilling bestilling = new Bestilling();
            bestilling.addPizza(Integer.parseInt(answer));
            System.out.println("Bestilling fuldendt?");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("ja")) {
                isOrderDone = true;
                bestillingsListe.activeOrders(bestilling);
                System.out.println("Bestilling oprettet!");
                try {
                    Thread.sleep(1250);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } while (!isOrderDone);
    }


    public void doneOrder() {//behandler færdige bestillinger
        bestillingsListe.getActiveOrders();
        System.out.println(bestillingsListe.allOrders);

        System.out.println("Er en bestilling færdig?");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("nej")){
            System.out.println("Okay!");
        }
        if(answer.equalsIgnoreCase("ja")){
            System.out.println("Hvilket order nummer er færdig?");
            answer = scanner.nextLine();
            for(int i = 0; i < bestillingsListe.allOrders.size(); i++){
                if(Integer.parseInt(answer) == bestillingsListe.allOrders.get(i).giveBackCounter()){
                    System.out.println("ønsker du at fjerne ordre: " + bestillingsListe.allOrders.get(i).giveBackCounter() + "?");
                    answer = scanner.nextLine();
                    if(answer.equalsIgnoreCase("ja")){
                        //TODO TILFØJ TIL ARKIV
                    }
                    if(answer.equalsIgnoreCase("nej")){

                    }
                    if(!answer.equalsIgnoreCase("ja") || !answer.equalsIgnoreCase("nej")){

                    }
                }else{
                    System.out.println("Kunne ikke finde en ordre med dette nummer!");
                }
            }
        }
    }

    public void menuCard() {//finder menu kortet frem

    }

    public void archive() {//Henter statistikker frem

    }
}










