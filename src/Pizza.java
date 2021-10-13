public class Pizza {
    private String name;
    private int price;
    private String standardToppings;
    private String ekstraToppings;
    private int id;

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
                this.name = "Vesuvio";
                this.price = 50;
                this.standardToppings = "tomat, ost";
                break;
            case 2:
                this.id = 2;
                this.name = "Test";
                this.price = 343;
                this.standardToppings = "tomat, ost, skinke";
                break;
            case 3:
                this.id = 3;
                this.name = "Pepperoni";
                this.price = 50;
                this.standardToppings = "tomat, ost, pepperoni";
                break;
            case 4:
                this.id = 4;
                this.name = "Hawaii";
                this.price = 50;
                this.standardToppings = "tomat, ost, skinke, ananas";
                break;
            case 5:
                this.id = 5;
                this.name = "Juventus";
                this.price = 50;
                this.standardToppings = "tomat, ost, kødsovs, løg";
                break;
            case 6:
                this.id = 6;
                this.name = "O'solo Mio";
                this.price = 50;
                this.standardToppings = "tomat, ost, skinke, pepperoni";
                break;
            case 7:
                this.id = 7;
                this.name = "Capricciosa";
                this.price = 50;
                this.standardToppings = "tomat , ost, skinke, champignon";
                break;
            case 8:
                this.id = 8;
                this.name = "Mama Mia";
                this.price = 50;
                this.standardToppings = "tomat, ost, skinke, bacon, rød peberfrugt, hvidløg";
                break;
            case 9:
                this.id = 9;
                this.name = "DAT21B KEA";
                this.price = 50;
                this.standardToppings = "tomat, ost, hakket oksekød, chili";
                break;
            case 10:
                this.id = 10;
                this.name = "Nørreport";
                this.price = 50;
                this.standardToppings = "tomat, ost, skinke, kødstrimler, bearnaise";
                break;
            case 11:
                this.id = 11;
                this.name = "Roma";
                this.price = 50;
                this.standardToppings = "tomat, ost, skinke, bacon, æg";
                break;
            case 12:
                this.id = 12;
                this.name = "Bella Milano";
                this.price = 50;
                this.standardToppings = "tomat, ost, kødstrimler, bacon, løg, hvidløg";
                break;
            case 13:
                this.id = 13;
                this.name = "La Luna";
                this.price = 50;
                this.standardToppings = "tomat, ost, kødstrimler, champignon, peberfrugt, gorgonzola, chili";
                break;
            case 14:
                this.id = 14;
                this.name = "Mimosa";
                this.price = 50;
                this.standardToppings = "tomat, ost, kebab, champignon, peberfrugt, chili";
                break;
            case 15:
                this.id = 15;
                this.name = "Pollo";
                this.price = 50;
                this.standardToppings = "tomat, ost, kylling, bacon, løg, peberfrugt";
                break;
            case 16:
                this.id = 16;
                this.name = "Bari";
                this.price = 50;
                this.standardToppings = "tomat, ost, kødstrimler, bacon, peberfrugt, hvidløg";
                break;
            case 17:
                this.id = 17;
                this.name = "San Remo";
                this.price = 50;
                this.standardToppings = "tomat, ost, skinke, pepperoni, bacon, kebab";
                break;
            case 18:
                this.id = 18;
                this.name = "La Fiesta";
                this.price = 50;
                this.standardToppings = "tomat, ost, kylling, bacon, kebab, kødstrimler";
                break;
            case 19:
                this.id = 19;
                this.name = "Cocktail Pølse Special";
                this.price = 50;
                this.standardToppings = "tomat, ost, skinke, pepperoni, cocktail pølser";
                break;
        }




    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Pizza: " + id +
                "\nname: " + name +
                "\nprice: " + price +
                "\nstandardToppings: " + standardToppings +
                "\nekstraToppings: " + ekstraToppings;
    }
}
