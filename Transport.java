import java.util.Objects;

public class Transport {
    private String category; // A, B, C, D;
    private String type;
    private int wheelAmount = 0;
    private double weight = 0;
    private int sitsAmount = 0;
    private boolean New = true;
    private double price = 0;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category.contains("A")) {
            this.category = "A";
        } else if (category.contains("B")) {
            this.category = "B";
        } else if (category.contains("C")) {
            this.category = "C";
        } else if (category.contains("D")) {
            this.category = "D";
        } else if (category.contains("E")) {
            this.category = "E";
        } else {
            this.category = category;
        }

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWheelAmount() {
        return wheelAmount;
    }

    public void setWheelAmount(int wheelAmount) {
        this.wheelAmount = wheelAmount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSitsAmount() {
        return sitsAmount;
    }

    public void setSitsAmount(int sitsAmount) {
        this.sitsAmount = sitsAmount;
    }

    public boolean isNew() {
        return New;
    }

    public void setNew(boolean New) {
        this.New = New;
    }

    public Transport() {
    }

    public Transport(boolean isNew) {
        this.New = isNew;
    }

    public Transport(boolean isNew, String category) {
        this.New = isNew;
        this.category = category;
    }

    public Transport(boolean isNew, double weight, String category, String type) {
        this.New = isNew;
        this.weight = weight;
        this.category = category;
        this.type = type;
    }

    public Transport(boolean isNew, double weight, String category, String type, int wheelAmount, int sitsAmount,
                     double price) {
        this.New = isNew;
        this.weight = weight;
        this.category = category;
        this.type = type;
        this.wheelAmount = wheelAmount;
        this.sitsAmount = sitsAmount;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return isNew() == transport.isNew() &&
                Objects.equals(transport.getType(), getType()) &&
                Double.compare(transport.getWeight(), getWeight()) == 0 &&
                transport.getWheelAmount() - getWheelAmount() == 0 &&
                transport.getSitsAmount() - getSitsAmount() == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCategory(), isNew(), getType(), getWeight(), getSitsAmount(), getWheelAmount());
    }

    @Override
    public String toString() {
        return "The " + getClass().getSimpleName() + " has a category " + getCategory() +
                ", has a type = " + getType() +
                (getSitsAmount() == 0.0 ? "" : (", has " + getSitsAmount()) + " sit(s)") +
                (getWheelAmount() == 0.0 ? "" : (", has " + getWheelAmount()) + " wheel(s)") +
                (getWeight() == 0.0 ? "" : (", has " + getWeight()) +  " tone(s)") +
                " is" + (isNew() ? "" : " not") + " new.";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

