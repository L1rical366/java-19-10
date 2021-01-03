public class App {
    public static void app(String[] args) {
        Base base = new Base(3);
        base.addEmployee(0, new Rate("Taras", 100, 120, "No", "No"));
        base.addEmployee(1, new HourlyPayment("Sima", 600, 10, "No","No",  1.0/8));
        base.addEmployee(2, new TradeRate("Dima", 600, "No", "Yes"));
        base.showList();
    }
}
