package ttttransport.carTransport;
import ttttransport.*;

public abstract class CarTransport extends Transport {
    private String locationWheel;
    private boolean machine;

    public CarTransport(String name, boolean wheelsCar, int numberPassenger, String locationWheel, boolean machine) {
        super(name, wheelsCar, numberPassenger);
        this.locationWheel = locationWheel;
        this.machine = machine;
    }

    public String getLocationWheel() {
        return locationWheel;
    }

    public void setLocationWheel(String locationWheel) {
        this.locationWheel = locationWheel;
    }

    public boolean isMachine() {
        return machine;
    }

    public void setMachine(boolean machine) {
        this.machine = machine;
    }
    public void info(){
        System.out.println("Это автомобильный трансопорт");
    }

}
