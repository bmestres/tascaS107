package nivell01.exercice02;

public class OnlineWorker extends Worker {

    private static final double INTERNET_FLAT_FEE = 59.5;

    public OnlineWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double computeSalary(double hoursWorked) {
        return this.pricePerHour * hoursWorked + INTERNET_FLAT_FEE;
    }

    @Deprecated
    public static double computeYearInternet() {
        return INTERNET_FLAT_FEE * 12;
    }
}
