public class Parking {
    private String name;
    private Car[] places; // null, Car, null, Car

    public Parking(String name, int nOfPlaces) {
        this.name = name;
        this.places = new Car[nOfPlaces]; // new Car[10]
    }

    public void addCar(Car car, int index) {
        if (index >= 0 && index < this.places.length && places[index] == null) {
            places[index] = car;
        }
    }

    public void addCar(Car car) {
        for (int i = 0; i < this.places.length; i++) {
            if (places[i] == null) {
                places[i] = car;
                return;
            }
        }
    }

    public void removeCarAt(int index) {
        if (index >= 0 && index < this.places.length) {
            this.places[index] = null;
        }
    }

    public boolean isFull() {
        for (int i = 0; i < this.places.length; i++) {
            if (this.places[i] == null) {
                return false;
            }
        }
        return true;
    }

    public boolean isTotallyEmpty() {
        for (int i = 0; i < this.places.length; i++) {
            if (this.places[i] != null) {
                return false;
            }
        }
        return true;
    }

    // [car, null, car, null, null]
    // -4

    public String toString() {
        String response = this.name + " [";
        for (int i = 0; i < this.places.length; i++) {
            if (this.places[i] == null) {
                response += "_,";
            } else {
                response += "@,";
            }
        }
        response += "]";
        return response;

    }

}