public class Car {
    private String brand;
    private String type;
    private double cc;
    private double weight;
    private double height;

    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public Car(String brand, String type, double cc) {
        this.brand = brand;
        this.type = type;
        this.cc = cc;
    }

    public double getAccelaration() {
        return (this.weight / this.cc) * 100 / 10;
    }

    public double getAccelaration(double value) {
        return (this.weight / this.cc) * value / 10;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public double getCc() {
        return cc;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "brand:" + this.brand + "\n" +
                "type:" + this.type + "\n" +
                "cc:" + this.cc + "\n" +
                "weight:" + this.weight + "\n" +
                "height:" + this.height + "\n" +
                "acceration:" + this.getAccelaration() + "\n" +
                "acceration 150:" + this.getAccelaration(150) + "\n";
    }
}
