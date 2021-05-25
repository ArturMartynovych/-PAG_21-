package zad1_2;

public class CarAccessory{

    private double carAccessoryWeight;
    private double carAccessoryPrice;

    public CarAccessory(double price, double weight) {
        this.carAccessoryPrice = price;
        this.carAccessoryWeight = weight;
    }

    public double getCarAccessoryWeight() {
        return carAccessoryWeight;
    }

    public void setAccessoryWeight(double carAccessoryWeight) {
        this.carAccessoryWeight = carAccessoryWeight;
    }

    public double getCarAccessoryPrice() {
        return carAccessoryPrice;
    }

    public void setCarAccessoryPrice(double carAccessoryPrice) {
        this.carAccessoryPrice = carAccessoryPrice;
    }

}