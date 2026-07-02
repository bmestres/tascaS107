package nivell01.exercice02;

public class Worker {
    String name;
    String surname;
    double pricePerHour;

    public Worker(String name, String surname, double pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public double computeSalary(double hoursWorked) {
        return this.pricePerHour * hoursWorked;
    }
}
