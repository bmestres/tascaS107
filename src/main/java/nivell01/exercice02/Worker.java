package nivell01.exercice02;

public abstract class Worker {

    private final String name;
    private final String surname;
    private double pricePerHour;

    public Worker(String name, String surname, double pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public double getPricePerHour(){
        return this.pricePerHour;
    }

    public abstract double computeSalary(double hoursWorked);
}
