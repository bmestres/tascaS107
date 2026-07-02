package nivell01.exercice01;

public abstract class Worker {

    private final String name;
    private final String surname;
    private double pricePerHour;

    public Worker(String name, String surname, double pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public double abstract computeSalary(double hoursWorked);
}
