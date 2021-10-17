public class Statistisk {
    private int saleOfDay;
    static private int allTimeSale;
    private String FavoritePizza;

    //region pizzaInts
    static int magarita;
    static int vesuvio;
    static int pepperoni;
    static int hawaii;
    static int juventus;
    static int osolomio;
    static int capricciosa;
    static int mamaMia;
    static int dat21bKea;
    static int nørreport;
    static int roma;
    static int bellaMilano;
    static int laLuna;
    static int mimosa;
    static int pollo;
    static int bari;
    static int sanRemo;
    static int laFiesta;
    static int cocktailSpecial;
    //endregion


    public void setSaleOfDay(int saleOfDay) {
        this.saleOfDay += saleOfDay;
    }

    public void setAllTimeSale(int allTimeSale) {//Til tekst fil
        this.allTimeSale += allTimeSale;
    }

    public void setFavoritePizza(String favoritePizza) {
        FavoritePizza = favoritePizza;
    }

    public int getAllTimeSale() {
        return allTimeSale;
    }

    public int getSaleOfDay() {
        return saleOfDay;
    }

    public String getFavoritePizza() {
        return FavoritePizza;
    }

    public void setMostPopularPizza(Bestilling bestilling) {
        for (int i = 0; i < bestilling.getPizzasInOrder().size(); i++) {
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("magarita")){
                magarita++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("vesuvio")){
                vesuvio++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("pepperoni")){
                pepperoni++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("hawaii")){
                hawaii++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("juventus")){
                juventus++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("osolomio")){
                osolomio++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("capricciosa")){
                capricciosa++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("mamaMia")){
                mamaMia++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("dat21b kea")){
                dat21bKea++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("nørreport")){
                nørreport++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("roma")){
                roma++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("bella Milano")){
                bellaMilano++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("la Luna")){
                laLuna++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("mimosa")){
                mimosa++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("pollo")){
                pollo++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("bari")){
                bari++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("san Remo")){
                sanRemo++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("la Fiesta")){
                laFiesta++;
            }
            if(bestilling.getPizzasInOrder().get(i).getName().equalsIgnoreCase("cocktail pølse Special")){
                cocktailSpecial++;
            }
        }
    }

    public String getMostPopularPizza(){
        //Ser om Magarita pizzaen er solgt mest
        if(magarita > vesuvio && magarita > pepperoni && magarita > hawaii && magarita > juventus && magarita > osolomio
                && magarita > capricciosa && magarita > mamaMia && magarita > dat21bKea && magarita > nørreport
                && magarita > roma && magarita > bellaMilano && magarita > laLuna && magarita > mimosa && magarita > pollo
                && magarita > bari && magarita > sanRemo && magarita > laFiesta && magarita > cocktailSpecial){

            return "Magarita";
        }else
        //Ser om Vesuvio pizzaen er solgt mest
        if(vesuvio > magarita && vesuvio > pepperoni && vesuvio > hawaii && vesuvio > juventus && vesuvio > osolomio
                && vesuvio > capricciosa && vesuvio > mamaMia && vesuvio > dat21bKea && vesuvio > nørreport
                && vesuvio > roma && vesuvio > bellaMilano && vesuvio > laLuna && vesuvio > mimosa && vesuvio > pollo
                && vesuvio > bari && vesuvio > sanRemo && vesuvio > laFiesta && vesuvio > cocktailSpecial){

            return "Vesuvio";
        }else
        //Ser om Pepperoni pizzaen er solgt mest
        if(pepperoni > vesuvio && pepperoni > magarita && pepperoni > hawaii && pepperoni > juventus && pepperoni > osolomio
                && pepperoni > capricciosa && magarita > mamaMia && pepperoni > dat21bKea && pepperoni > nørreport
                && pepperoni > roma && pepperoni > bellaMilano && pepperoni > laLuna && pepperoni > mimosa && pepperoni > pollo
                && pepperoni > bari && pepperoni > sanRemo && pepperoni > laFiesta && pepperoni > cocktailSpecial){

            return "Pepperoni";
        }else
        //Ser om Hawaii pizzaen er solgt mest
        if(hawaii > vesuvio && hawaii > pepperoni && hawaii > magarita && magarita > juventus && hawaii > osolomio
                && hawaii > capricciosa && hawaii > mamaMia && hawaii > dat21bKea && hawaii > nørreport
                && hawaii > roma && hawaii > bellaMilano && hawaii > laLuna && hawaii > mimosa && hawaii > pollo
                && hawaii > bari && hawaii > sanRemo && hawaii > laFiesta && hawaii > cocktailSpecial){

            return "Hawaii";
        }else
        //Ser om Juventus pizzaen er solgt mest
        if(juventus > vesuvio && juventus > pepperoni && juventus > hawaii && juventus > magarita && juventus > osolomio
                && juventus > capricciosa && juventus > mamaMia && juventus > dat21bKea && juventus > nørreport
                && juventus > roma && juventus > bellaMilano && juventus > laLuna && juventus > mimosa && juventus > pollo
                && juventus > bari && juventus > sanRemo && juventus > laFiesta && juventus > cocktailSpecial){

            return "Juventus";
        }else
        //Ser om O'solo Mio pizzaen er solgt mest
        if(osolomio > vesuvio && osolomio > pepperoni && osolomio > hawaii && osolomio > juventus && osolomio > magarita
                && osolomio > capricciosa && osolomio > mamaMia && osolomio > dat21bKea && osolomio > nørreport
                && osolomio > roma && osolomio > bellaMilano && osolomio > laLuna && osolomio > mimosa && osolomio > pollo
                && osolomio > bari && osolomio > sanRemo && osolomio > laFiesta && osolomio > cocktailSpecial){

            return "O'solo Mio";
        }else
        //Ser om Capricciosa pizzaen er solgt mest
        if(capricciosa > vesuvio && capricciosa > pepperoni && capricciosa > hawaii && capricciosa > juventus && capricciosa > osolomio
                && capricciosa > magarita && capricciosa > mamaMia && capricciosa > dat21bKea && capricciosa > nørreport
                && capricciosa > roma && capricciosa > bellaMilano && capricciosa > laLuna && capricciosa > mimosa && capricciosa > pollo
                && capricciosa > bari && capricciosa > sanRemo && capricciosa > laFiesta && capricciosa > cocktailSpecial){

            return "Capricciosa";
        }else
        //Ser om mamaMia pizzaen er solgt mest
        if(mamaMia > vesuvio && mamaMia > pepperoni && mamaMia > hawaii && mamaMia > juventus && mamaMia > osolomio
                && mamaMia > capricciosa && mamaMia > magarita && mamaMia > dat21bKea && mamaMia > nørreport
                && mamaMia > roma && mamaMia > bellaMilano && mamaMia > laLuna && mamaMia > mimosa && mamaMia > pollo
                && mamaMia > bari && mamaMia > sanRemo && mamaMia > laFiesta && mamaMia > cocktailSpecial){

            return "Mama Mia";
        }else
        //Ser om DAT21B KEA pizzaen er solgt mest
        if(dat21bKea > vesuvio && dat21bKea > pepperoni && dat21bKea > hawaii && dat21bKea > juventus && dat21bKea > osolomio
                && dat21bKea > capricciosa && dat21bKea > mamaMia && dat21bKea > magarita && dat21bKea > nørreport
                && dat21bKea > roma && dat21bKea > bellaMilano && dat21bKea > laLuna && dat21bKea > mimosa && dat21bKea > pollo
                && dat21bKea > bari && dat21bKea > sanRemo && dat21bKea > laFiesta && dat21bKea > cocktailSpecial){

            return "DAT21B KEA";
        }else
        //Ser om Nørreport pizzaen er solgt mest
        if(nørreport > vesuvio && nørreport > pepperoni && nørreport > hawaii && nørreport > juventus && nørreport > osolomio
                && nørreport > capricciosa && nørreport > mamaMia && nørreport > dat21bKea && nørreport > magarita
                && nørreport > roma && nørreport > bellaMilano && nørreport > laLuna && nørreport > mimosa && nørreport > pollo
                && nørreport > bari && nørreport > sanRemo && nørreport > laFiesta && nørreport > cocktailSpecial){

            return "Nørreport";
        }else
        //Ser om Roma pizzaen er solgt mest
        if(roma > vesuvio && roma > pepperoni && roma > hawaii && roma > juventus && roma > osolomio
                && roma > capricciosa && roma > mamaMia && roma > dat21bKea && roma > nørreport
                && roma > magarita && roma > bellaMilano && roma > laLuna && roma > mimosa && roma > pollo
                && roma > bari && roma > sanRemo && roma > laFiesta && roma > cocktailSpecial){

            return "Roma";
        }else
        //Ser om Bella Milano pizzaen er solgt mest
        if(bellaMilano > vesuvio && bellaMilano > pepperoni && bellaMilano > hawaii && bellaMilano > juventus && bellaMilano > osolomio
                && bellaMilano > capricciosa && bellaMilano > mamaMia && bellaMilano > dat21bKea && bellaMilano > nørreport
                && bellaMilano > roma && bellaMilano > magarita && bellaMilano > laLuna && bellaMilano > mimosa && bellaMilano > pollo
                && bellaMilano > bari && bellaMilano > sanRemo && bellaMilano > laFiesta && bellaMilano > cocktailSpecial){

            return "Bella Milano";
        }else
        //Ser om La Luna pizzaen er solgt mest
        if(laLuna > vesuvio && laLuna > pepperoni && laLuna > hawaii && laLuna > juventus && laLuna > osolomio
                && laLuna > capricciosa && laLuna > mamaMia && laLuna > dat21bKea && laLuna > nørreport
                && laLuna > roma && laLuna > bellaMilano && laLuna > magarita && laLuna > mimosa && laLuna > pollo
                && laLuna > bari && laLuna > sanRemo && laLuna > laFiesta && laLuna > cocktailSpecial){

            return "La Luna";
        }else
        //Ser om Mimosa pizzaen er solgt mest
        if(mimosa > vesuvio && mimosa > pepperoni && mimosa > hawaii && mimosa > juventus && mimosa > osolomio
                && mimosa > capricciosa && mimosa > mamaMia && mimosa > dat21bKea && mimosa > nørreport
                && mimosa > roma && mimosa > bellaMilano && mimosa > laLuna && mimosa > magarita && mimosa > pollo
                && mimosa > bari && mimosa > sanRemo && mimosa > laFiesta && mimosa > cocktailSpecial){

            return "Mimosa";
        }else
        //Ser om Pollo pizzaen er solgt mest
        if(pollo > vesuvio && pollo > pepperoni && pollo > hawaii && pollo > juventus && pollo > osolomio
                && pollo > capricciosa && pollo > mamaMia && pollo > dat21bKea && pollo > nørreport
                && pollo > roma && pollo > bellaMilano && pollo > laLuna && pollo > mimosa && pollo > magarita
                && pollo > bari && pollo > sanRemo && pollo > laFiesta && pollo > cocktailSpecial){

            return "Pollo";
        }else
        //Ser om Bari pizzaen er solgt mest
        if(bari > vesuvio && bari > pepperoni && bari > hawaii && bari > juventus && bari > osolomio
                && bari > capricciosa && bari > mamaMia && bari > dat21bKea && bari > nørreport
                && bari > roma && bari > bellaMilano && bari > laLuna && bari > mimosa && bari > pollo
                && bari > magarita && bari > sanRemo && bari > laFiesta && bari > cocktailSpecial){

            return "Bari";
        }else
        //Ser om San Remo pizzaen er solgt mest
        if(sanRemo > vesuvio && sanRemo > pepperoni && sanRemo > hawaii && sanRemo > juventus && sanRemo > osolomio
                && sanRemo > capricciosa && sanRemo > mamaMia && sanRemo > dat21bKea && sanRemo > nørreport
                && sanRemo > roma && sanRemo > bellaMilano && sanRemo > laLuna && sanRemo > mimosa && sanRemo > pollo
                && sanRemo > bari && sanRemo > magarita && sanRemo > laFiesta && sanRemo > cocktailSpecial){

            return "San Remo";
        }else
        //Ser om La Fiesta pizzaen er solgt mest
        if(laFiesta > vesuvio && laFiesta > pepperoni && laFiesta > hawaii && laFiesta > juventus && laFiesta > osolomio
                && laFiesta > capricciosa && laFiesta > mamaMia && laFiesta > dat21bKea && laFiesta > nørreport
                && laFiesta > roma && laFiesta > bellaMilano && laFiesta > laLuna && laFiesta > mimosa && laFiesta > pollo
                && laFiesta > bari && laFiesta > sanRemo && laFiesta > magarita && laFiesta > cocktailSpecial){

            return "La Fiesta";

            //Ser om Cocktail Pølse Special pizzaen er solgt mest
        }else if(cocktailSpecial > vesuvio && cocktailSpecial > pepperoni && cocktailSpecial > hawaii
                && cocktailSpecial > juventus && cocktailSpecial > osolomio
                && cocktailSpecial > capricciosa && cocktailSpecial > mamaMia && cocktailSpecial > dat21bKea
                && cocktailSpecial > nørreport
                && cocktailSpecial > roma && cocktailSpecial > bellaMilano && cocktailSpecial > laLuna
                && cocktailSpecial > mimosa && cocktailSpecial > pollo
                && cocktailSpecial > bari && cocktailSpecial > sanRemo && cocktailSpecial > laFiesta
                && cocktailSpecial > magarita){

            return "Cocktail Pølse Special";
        }else{
            return "Der er ikke en pizza der er solgt flest gange";
        }



    } //TODO Finde en nem måde at optimere denne på. Den kan ikke printe ud, hvis 2 pizzaer er solgt mest af
}