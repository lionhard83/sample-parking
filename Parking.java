import java.util.ArrayList;

public class Parking {
    private String name;
    private int limitPlaces;
    // private Car[] places; // null, Car, null, Car
    private ArrayList<Car> places = new ArrayList<Car>();

    public Parking(String name, int limit) {
        this.name = name;
        this.limitPlaces = limit;
    }

    // public void addCar(Car car, int index) {
    // if (index >= 0 && index < this.places.length && places[index] == null) {
    // places[index] = car;
    // }
    // }

    public void addCar(Car car) {
        if (this.places.size() < limitPlaces) {
            places.add(car);
        }
    }

    public void removeCarAt(int index) {
        // if (index >= 0 && index < this.places.length) {
        if (index >= 0 && index < this.places.size()) {
            // this.places[index] = null;
            this.places.remove(index);
        }
    }

    public boolean isFull() {
        return this.places.size() == this.limitPlaces;
    }

    public boolean isTotallyEmpty() {
        return this.places.isEmpty();
    }

    // [car, null, car, null, null]
    // -4

    public String toString() {
        String response = this.name + " [";
        for (Car cIesime : this.places) {
            response += cIesime.toString();
        }
        response += "]";
        return response;

    }

}