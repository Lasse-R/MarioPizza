import java.util.ArrayList;

public class Bestilling {
    static int statiskBestillingCounter = 0;
    private int counterForObject;
    private ArrayList<Pizza> pizzaForOrder = new ArrayList<>();
    public Bestilling(){
        statiskBestillingCounter++;
        counterForObject = statiskBestillingCounter;

        }


    public int giveBackCounter(){
        return counterForObject;
    }

    public void addPizza(int choosePizza){
        Pizza pizza = new Pizza(choosePizza);
        pizzaForOrder.add(pizza);

    }

    public void deleteOrder(Bestilling bestilling){
        pizzaForOrder = new ArrayList<>();
        System.out.println("ORDER DELETED!");
    }

    public ArrayList<Pizza> getPizzasInOrder(){
        return pizzaForOrder;

    }

}
