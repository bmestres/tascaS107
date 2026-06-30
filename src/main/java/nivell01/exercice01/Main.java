package nivell01.exercice01;

public class Main {

    public static void main(String[]args){

        OnSiteWorker.setPetrol(200.25);

        Worker worker1 = new OnlineWorker("Andrej", "Karpathy", 30.75);
        Worker worker2 = new OnSiteWorker("Peter", "Steinberger", 22.5);

        System.out.format("%.2f €\n", worker1.computeSalary(135));
        System.out.format("%.2f €\n", worker2.computeSalary(180.5));
    }
}
