package Products;

import java.util.Objects;

public class Product {
    private final int id;
    private final String name;
    private final String code;
    private int quantity;
    private double price;
    public Product(int id, String name, String code, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.code = code;
    }
    private void changePrice(double price){
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }
    public String getCode() {
        return code;
    }

    public void decreaseQuantity(){
        this.quantity--;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && quantity == product.quantity && Double.compare(price, product.price) == 0 && Objects.equals(name, product.name) && Objects.equals(code, product.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code, quantity, price);
    }
}
