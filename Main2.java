public class Main2 {
    public static void main(String[] args) {

        Parking p = new Parking("Lumbi", 10);
        Car c = new Car("fiat", "tipo");
        p.addCar(c);

        Car c2 = new Car("citroen", "c2");
        p.addCar(c2);
        System.out.println(p);

    }
}