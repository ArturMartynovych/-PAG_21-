package PAG_ZAD_2.src;

public class Product {
    private String name;
    private double price;
    private boolean isProductFresh;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isProductFresh() {
        return isProductFresh;
    }

    public void setProductFresh(boolean productFresh) {
        isProductFresh = productFresh;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, boolean isProductFresh){
        this.name = name;
        this.price = price;
        this.isProductFresh = isProductFresh;
    }

}
