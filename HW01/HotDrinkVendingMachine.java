import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    List<HotDrink> hotDrinks;

    public HotDrinkVendingMachine(List<HotDrink> products) {
        this.hotDrinks = products;
    }

    public List<HotDrink> getHotDrink() {
        return hotDrinks;
    }

    public void setHotDrink(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrink drink : hotDrinks) {
            if(drink.getName().equals(name))
                return drink;
        }
        return null;
    }
    public Product getProduct(String name, double volume){
        for (HotDrink drink : hotDrinks) {
            if(drink.getName().equals(name) && drink.getVolume() == volume)
                return drink;
        }
        return null;
    }
    public Product getProduct(String name, double volume, int temperature){
        for (HotDrink drink : hotDrinks) {
            if(drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature)
                return drink;
        }
        return null;
    }
    public void addHotDrink(HotDrink hotDrink){
        this.hotDrinks.add(hotDrink);
    }
}
