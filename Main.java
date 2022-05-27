import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // System.out.println("-------------------\n");
        // Car c3 = new Car("Jaguar", "EPace");
        // c3.setCc(400);
        // Car c4 = new Car("Mercedes", "XLS", 2000);

        // c3.setWeight(1000);
        // c4.setWeight(900);

        // System.out.println(c3.getAccelaration(200));
        // System.out.println(c4);
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Type your brand car:");
            String brand = s.next();
            System.out.println("Type your model car:");
            String model = s.next();
            System.out.println("Type your cc car:");
            Double cc = s.nextDouble();

            Car car = new Car(brand, model, cc);
            System.out.println(car);

            System.out.println("Do you want create another car? 0 to exit");
            int yourChoice = s.nextInt();

            if (yourChoice == 0) {
                return;
            }
        }

    }
}