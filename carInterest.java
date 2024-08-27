import java.util.Scanner;

class Car {
    private String model;
    private double price;
    private double taxRate;

    public Car (String model, double price, double taxRate) {
        this.model = model;
        this.price = price;
        this.taxRate = taxRate;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
    
    public double getTaxRate() {
        return taxRate;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}


public class carInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        double price = sc.nextDouble();
        double taxRate = sc.nextDouble();
        double discountRate = sc.nextDouble();

        Car car = new Car(model, price, taxRate);

        double finalPrice = calculateFinalPrice(car, discountRate);
        System.out.printf("%.3f\n",finalPrice);

        sc.close();
    }

    static double calculateFinalPrice(Car car, double discountRate) {
        double discount = (car.getPrice() * discountRate)/100.0;
        double discountedPrice = car.getPrice() - discount;
        double taxRate = (discountedPrice * car.getTaxRate())/100.0;
        double finalprice = discountedPrice + taxRate;
        return finalprice;
    }
}
