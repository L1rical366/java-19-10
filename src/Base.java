public class Base {
    private int l;
    private Worker[] list;

    public Base(int l) {
        list = new Worker[l];
    }

    public void addEmployee(int id, Worker worker){
        list[id] = worker;
    }

    public void showList(){
        int total = 0;
        for (Worker worker : list) {
            System.out.print("Name: " + worker.getName() + ";");
            System.out.print(" " + "Type:" + worker.getType() + ";");
            System.out.print(" " + "Duty:" + worker.getDuty() + "%" + ";");
            System.out.print(" " + "Salary:" + worker.getSalary() + ";");
            System.out.println(" " + "Against payment:" + worker.getAgainstPayment() + ";");
            total += worker.getSalary();
        }
        System.out.println("Total: " + total);
    }
}
