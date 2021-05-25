package zad3_4;

import java.util.*;

public class Koszyk {
    public Stack<ProductWKoszyku> stack = new Stack<>();
    public double sum;
    public int sum_of_prod;

    public void addProduct(Product product, int quantity) {
        ProductWKoszyku productWKoszyku = new ProductWKoszyku(product);
        productWKoszyku.setLiczbaSztukProduktu(quantity);
        sum += productWKoszyku.getPrice() * quantity;
        stack.push(productWKoszyku);
        sum_of_prod++;
    }

    public void showLast(Koszyk koszyk){
        Product product = stack.peek();
        System.out.println(product);
    }

    public void getOut(Koszyk koszyk){
        Product product = stack.pop();
        System.out.println(product);
    }

    public void showAll(Koszyk koszyk){
        while (sum_of_prod > 0){
            getOut(koszyk);
            sum_of_prod--;
        }
    }

    public double getSum() {
        return sum;
    }
    public void setSum(double sum) {
        this.sum = sum;
    }

    public Koszyk() {

    }

    public String toString() {
        return stack + " " + "sumaryczna cena: " + getSum();
    }

}
