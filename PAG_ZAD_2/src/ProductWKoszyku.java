package PAG_ZAD_2.src;

public class ProductWKoszyku extends Product {
    private boolean isInBasket;
    private int liczbaSztukProduktu;

    public boolean isInBasket() {
        return isInBasket;
    }

    public void setInBasket(boolean inBasket) {
        isInBasket = inBasket;
    }


    public ProductWKoszyku(String name, double price, boolean isProductFresh) {
        super(name, price, isProductFresh);
    }

    public ProductWKoszyku(String name, double price, boolean isProductFresh, boolean isInBasket, int liczbaSztukProduktu) {
        super(name, price, isProductFresh);
        this.isInBasket = isInBasket;
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
                ", " + (super.isProductFresh() ? ("jest świeży ") : ("nie jest świeży")) +
                ", " + (isInBasket() ? ("jest w koszyku "): ("nie jest w koszyku")) +
                ", " + "ilość produktów: " + getLiczbaSztukProduktu();
    }
}
