public class HourlyPayment extends Worker {
    private int hour;
    private int rate;
    private  int duty = 20;
    private int againstPayment;
    private double currencyRate;

    public HourlyPayment(String name, int hour, int rate, String haveChild, String Offshore, double currencyRate) {
        super(name, "hourly rates");
        this.hour = hour;
        this.rate = rate;
        this.currencyRate = currencyRate;
        if(haveChild.equals("no")) duty+=5;
        if(Offshore.equals("yes")) duty = 0;
        setTax(duty);
        setSalary((rate * hour));
        if(Offshore.equals("no") && hour >= 200){
            setSalary(getSalary() + (int)(getSalary()*0.3));
        }
        againstPayment = getSalary() - (getSalary() / 100 * duty);
        setAgainstPayment(againstPayment);
    }

    @Override
    public String getAgainstPayment() {
        return String.valueOf(againstPayment/2) + "/" + String.valueOf((int)(againstPayment/2 * currencyRate));
    }
}
