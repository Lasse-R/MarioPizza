public class Main {
    public static void main(String[] args) {
        Menukort menukort = new Menukort();
    Pizza pizza1 = new Pizza(1);
        System.out.println(pizza1.getName());
        menukort.menuCard.add(pizza1);

        System.out.println(menukort.menuCard);

    }
}
