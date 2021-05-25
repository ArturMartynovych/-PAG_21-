package zad3_4;

public class ProductWKoszyku extends Product {
    private int liczbaSztukProduktu;

    public ProductWKoszyku(Product product) {
        super(product.getName(), product.getPrice());
    }

    public ProductWKoszyku(String name, double price, boolean isProductFresh) {
        super(name, price);
    }

    public ProductWKoszyku(String name, double price, int liczbaSztukProduktu) {
        super(name, price);
        this.liczbaSztukProduktu = liczbaSztukProduktu;
    }

    public int getLiczbaSztukProduktu() {
        return liczbaSztukProduktu;
    }

    public void setLiczbaSztukProduktu(int liczbaSztukProduktu) {
        this.liczbaSztukProduktu = liczbaSztukProduktu;
    }

    @Override
    public String toString() {
        return "Nazwa: " + super.getName() + ", " + "kosztuję: " + super.getPrice() +
                ", " + "ilość produktów: " + getLiczbaSztukProduktu();
    }
}
