public class Rate extends Worker {
    private  int days;
    private  int rate;
    private  int duty = 20;

    public Rate(String name, int days, int rate, String haveChild, String Offshore) {
        super(name, "Rate");
        this.days = days;
        this.rate = rate;
        if(haveChild.equals("No")) duty+=5;
        if(Offshore.equals("Yes")) duty = 0;
        setTax(duty);
        setSalary((rate * days));
        if(Offshore.equals("No") && (days * 8) >= 200){
            setSalary(getSalary() + (int)(getSalary()*0.3));
        }
        setAgainstPayment(getSalary() - (getSalary() / 100 * duty));
    }
}
