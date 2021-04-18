public class TransportMain {
    public static void main(String[] args) {

        Transport transport1 = new Transport(true,2.2,"B","Universal",4,5,10000);
        Transport transport2 = new Transport(true,4,"B","Sedan",4,5,15000);

        System.out.println(transport1.equals(transport2));


        Car car = new Car("Audi",true,2.2,"B","Universal",4,5,10000);
        Car car1 = new Car("Audi",true,2.2,"B","Universal",4,5,10000);

        System.out.println(car.equals(car1));

        CarAccessory bamper = new CarAccessory(500,0.1);
        CarAccessory bamper2 = new CarAccessory(700,0.05);

        car.addAccessory(bamper);
        car1.addAccessory(bamper2);

        System.out.println(car.equals(car1));

        System.out.printf("%s%n",car);

        car.unlock();
        car.turnedOn();

        System.out.printf("%s%n",car);


    }


}
