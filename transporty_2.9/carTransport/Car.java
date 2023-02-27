package ttttransport.carTransport;

public class Car extends CarTransport{
    private String color;
    private String carNumber;

    public Car(String name, boolean wheelsCar, int numberPassenger, String locationWheel, boolean machine, String color, String carNumber) {
        super(name, wheelsCar, numberPassenger, locationWheel, machine);
        this.color = color;
        this.carNumber = carNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
