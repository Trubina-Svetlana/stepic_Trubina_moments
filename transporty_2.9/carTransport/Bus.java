package ttttransport.carTransport;
import ttttransport.publicTransport;


public class Bus extends CarTransport implements publicTransport {
    private double price;
    private double sale;
    private String conductor;

    public Bus(String name, boolean wheelsCar, int numberPassenger, String locationWheel, boolean machine, double price, double sale, String conductor) {
        super(name, wheelsCar, numberPassenger, locationWheel, machine);
        this.price = price;
        this.sale = sale;
        this.conductor = conductor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
    @Override
    public void farePayment(){
        System.out.println("Цена проезда" + getPrice());
    }
}
