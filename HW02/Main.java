public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Men men1 = new Men("Петров Николай");
        Men men2 = new Men("Сидоров Платон");
        market.acceptToMarket(men1);
        market.acceptToMarket(men2);
        market.update();
    }
}