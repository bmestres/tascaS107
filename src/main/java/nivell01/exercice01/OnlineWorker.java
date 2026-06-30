package nivell01.exercice01;

public class OnlineWorker extends Worker {

    private static final double INTERNET_FLAT_FEE = 59.5;

    public OnlineWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double computeSalary(double hoursWorked) {
        return super.computeSalary(hoursWorked) + INTERNET_FLAT_FEE;
    }
}
