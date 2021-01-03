public class TradeRate extends  Worker{
    private  int duty = 15;

    public TradeRate(String name, int salary, String haveChild, String Offshore) {
        super(name, "Trade Rate");
        if(haveChild.equals("No")) duty+=5;
        if(Offshore.equals("Yes")) duty = 0;
        setTax(duty);
        setSalary(salary);
        setAgainstPayment(salary - salary/ 100 * duty);
    }
}
