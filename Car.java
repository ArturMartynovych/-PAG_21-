package zad1;

import com.company.ToolBox;

import java.util.ArrayList;
import java.util.Objects;

public class Car extends Transport{
    private String name;

    public Car() {
        super();
    }

    public Car(String name, boolean isNew) {
        super(isNew);
        this.name = name;
    }

    public Car(String name, boolean isNew, String category) {
        super(isNew, category);
        this.name = name;
    }

    public Car(String name, boolean isNew, double weight, String category, String type) {
        super(isNew, weight, category, type);
    }

    public Car(String name, boolean isNew, double weight, String category, String type, int wheelAmount, int sitsAmount, double Price) {
        super(isNew, weight, category, type, wheelAmount, sitsAmount, Price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private final ArrayList<CarAccessory> carAccessories = new ArrayList<>();

    public void addAccessory(CarAccessory carAccessory) {
        if (carAccessories.add(carAccessory)) {
            setWeight(getWeight() + carAccessory.getCarAccessoryWeight());
        }
    }

    public void removeAccessory(CarAccessory carAccessory) {
        if (carAccessories.remove(carAccessory)) {
            setWeight(getWeight() - carAccessory.getCarAccessoryWeight());
        }
    }

    public ArrayList<CarAccessory> getCarAccessories() {
        return carAccessories;
    }
    private boolean working = false;
    private boolean locked = true;

    public boolean isWorking() {
        return working;
    }

    public boolean isLocked() {
        return locked;
    }

    public void turnedOn() {
        if (isLocked()) {
            throw new RuntimeException("Cannot drive " + getClass().getSimpleName() +
                    ". Try to unlock it first.");
        }
        working = true;
    }

    public void turnedOff() {
        working = false;
    }

    public void lock() {
        locked = true;
    }

    public void unlock() {
        locked = false;
    }

    public boolean contains(CarAccessory carAccessory){
        if (carAccessory != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "This is " + getName() + ". " + super.toString() + " This " + getClass().getSimpleName() + " currently is" +
                (isLocked() ? (" locked and ") : (" not locked and")) + (isWorking() ? (" working.") : (" not working."));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return isWorking() == car.isWorking() && isLocked() == car.isLocked() && getCarAccessories().equals(car.getCarAccessories());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCarAccessories(), isWorking(), isLocked());
    }
}
