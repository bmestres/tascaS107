package nivell01.exercice01;

public class OnSiteWorker extends Worker {

    private static double petrol;

    public OnSiteWorker(String name, String surname, double pricePerHour){
        super(name, surname, pricePerHour);
    }

    public static void setPetrol(double petrol){
        OnSiteWorker.petrol = petrol;
    }

    @Override
    public double computeSalary(double hoursWorked) {
        return getPricePerHour() * hoursWorked + petrol;
    }
}
