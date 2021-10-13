public class Pizza {
    private String name;
    private int price;
    private String standardToppings;
    private String ekstraToppings;
    private int id;

    Pizza(){}

    public Pizza(int whichPizza){
        thirtyPizza(whichPizza);
    }
    public Pizza(int whichPizza, String ekstraTop) {
        thirtyPizza(whichPizza);
    }


        public void thirtyPizza(int whichPizza){
        switch (whichPizza){
            case 1:
                this.id = 1;
                this.name = "Margarita";
                this.price = 50;
                this.standardToppings = "tomat, ost";
                break;
            case 2:
                this.id = 2;
                this.name = "Test 2";
                this.price = 343;
                this.standardToppings = "tomat, ost";
                break;
            case 3:
                this.id = 3;
                this.name = "Test 3";
                this.price = 50;
                this.standardToppings = "tomat, ost";
                break;
            case 4:
                this.id = 4;
                this.name = "Test 4";
                this.price = 50;
                this.standardToppings = "tomat, ost";
                break;
            case 5:
                this.id = 5;
                this.name = "test 5";
                this.price = 50;
                this.standardToppings = "tomat, ost";
                break;

        }




    }
    public String getName(){
        return this.name;
    }


    public String toString() {
        return "Pizza: " + id +
                "\nname: " + name +
                "\nprice: " + price +
                "\nstandardToppings: " + standardToppings +
                "\nekstraToppings: " + ekstraToppings;
    }
}
