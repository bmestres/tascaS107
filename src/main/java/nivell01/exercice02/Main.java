package nivell01.exercice02;

@SuppressWarnings("deprecation")
public class Main {
    public static void main(String[] args) {

        OnSiteWorker.setPetrol(0.84);
        OnSiteWorker.printPetrol();

        System.out.printf("Internet year price: %.2f €", OnlineWorker.computeYearInternet());
    }
}
