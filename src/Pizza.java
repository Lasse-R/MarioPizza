public class Pizza {
    private String name;
    private int price;
    private String standardToppings;
    private String ekstraToppings;

    public Pizza(int whichPizza){
        thirtyPizza(whichPizza);
    }
    public Pizza(int whichPizza, String ekstraTop) {
        thirtyPizza(whichPizza);
    }








        public void thirtyPizza(int whichPizza){
        switch (whichPizza){
            case 1:
                this.name = "Margarita";
                this.price = 50;
                this.standardToppings = "tomat, ost";
                break;
            case 2:
                break;

        }




    }
    public String getName(){
        return this.name;
    }


}
