import java.util.Scanner;

public class PM2000 {
    Scanner scanner = new Scanner(System.in);
    Menukort menukort = new Menukort();
    BestillingsListe bestillingsListe = new BestillingsListe();
    Arkiv theArchive = Arkiv.getInstance();
    Statistisk statistisk = new Statistisk();

    public void startProgram() {
        menukort.menuCreate();


        boolean runningFlag = true;
        System.out.println("PizzaMachine2000 is starting");
        while (runningFlag) {
            System.out.println("""
                    MENU:
                    1 - Ny bestilling
                    2 - Bestillinger
                    3 - Arkiv
                    4 - Menukort""");
            if (scanner.hasNextLine()) {
                String userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("ny bestilling") || Integer.parseInt(userInput) == 1) {
                    System.out.println();
                    newOrder();
                }
                if (userInput.equalsIgnoreCase("bestillinger") || Integer.parseInt(userInput) == 2) {
                    doneOrder();
                }
                if (userInput.equalsIgnoreCase("arkiv") || Integer.parseInt(userInput) == 3) {
                    archive();
                }
                if (userInput.equalsIgnoreCase("menukort") || Integer.parseInt(userInput) == 4) {
                    menuCard();
                }

            } else {
                System.out.println("Try again");
            }
        }
    }


    public static void main(String[] args) {
        PM2000 pmrunTime = new PM2000();
        pmrunTime.startProgram();
    }

    public void newOrder() {//Opretter ny bestilling
        boolean isOrderDone = false;
        Bestilling bestilling = new Bestilling();
        do {

            System.out.println("Hvilken pizza vil du tilføje?");
            String answer = scanner.nextLine();
            bestilling.addPizza(Integer.parseInt(answer));
            System.out.println("Pizza tilføjet!");
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
            boolean isDone = false;
            do {
                System.out.println("Hvilket order nummer er færdig?");
                answer = scanner.nextLine();
                for (int i = 0; i < bestillingsListe.allOrders.size(); i++) {
                    if (Integer.parseInt(answer) == bestillingsListe.allOrders.get(i).giveBackCounter()) {
                        System.out.println("ønsker du at fjerne ordre: " + bestillingsListe.allOrders.get(i).giveBackCounter() + "?");
                        answer = scanner.nextLine();
                        if (answer.equalsIgnoreCase("ja")) {
                            statistisk.setAllTimeSale(bestillingsListe.allOrders.get(i).getOrderPrice());
                            statistisk.setMostPopularPizza(bestillingsListe.allOrders.get(i));
                            System.out.println("ordre: " + bestillingsListe.allOrders.get(i).giveBackCounter() + " blev slettet og arkiveret");
                            bestillingsListe.allOrders.remove(i);
                            isDone = true;
                        }
                    } else {
                        System.out.println("Kunne ikke finde en ordre med dette nummer!");
                    }
                }
            }while (!isDone);
        }
    }

    public void menuCard() {//finder menu kortet frem
        menukort.printMenu();
    }

    public void archive() {//Henter statistikker frem

        System.out.println("Der er solgt for i alt: " + statistisk.getAllTimeSale() + "kr.");
        System.out.println("Mest solgte pizza: " + statistisk.getMostPopularPizza());
    }
}