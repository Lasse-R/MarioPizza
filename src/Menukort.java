import java.util.ArrayList;

public class Menukort {
    ArrayList<Pizza> menuCard = new ArrayList<>();


    public void menuCreate(){
        for(int i = 1; i <= 19; i++){
            Pizza pizza = new Pizza(i);
            menuCard.add(pizza);
        }

    }

    public void printMenu(){
        System.out.println(menuCard);
    }

}
