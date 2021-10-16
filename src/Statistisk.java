public class Statistisk {
    private int saleOfDay;
    static private int allTimeSale;
    private String FavoritePizza;


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
}
