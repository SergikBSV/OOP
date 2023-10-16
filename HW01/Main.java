import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HotDrink h1 = new HotDrink("1", 1, 1, 80);
        HotDrink h2 = new HotDrink("2", 2, 2, 65);
        HotDrink h3 = new HotDrink("5", 4, 3, 90);
        HotDrink h4 = new HotDrink("15", 123, 1, 88);
        HotDrink h5 = new HotDrink("20", 6, 5, 75);

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine(new ArrayList<>());
        vendingMachine.addHotDrink(h1);
        vendingMachine.addHotDrink(h2);
        vendingMachine.addHotDrink(h3);
        vendingMachine.addHotDrink(h4);
        vendingMachine.addHotDrink(h5);
        for (HotDrink h : vendingMachine.getHotDrink()) {
            System.out.println(h);
       }
    }
}