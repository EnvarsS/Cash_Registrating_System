package Products;

import java.util.ArrayList;

public class ProductManager {
    private static final ArrayList<Product> products = new ArrayList<>();

    private static Product createProduct(String name, String code, int quantity, double price){
        int id = products.size() + 1;
        return new Product(id, name, code, quantity, price);
    }
    public void addProduct(String name, String code, int quantity, double price){
        Product product = createProduct(name, code, quantity, price);

        if(findProduct(product.getName()) != null){
            throw new IllegalArgumentException("Product with this code already exists!");
        }
        products.add(product);
    }
    private static Product findProduct(String code){
        for(Product product : products){
            if(product.getName().equalsIgnoreCase(code))
                return product;
        }
        return null;
    }
    private static int findProductIndex(String code){
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getCode().equalsIgnoreCase(code))
                return i;
        }
        return -1;
    }
    public void removeProduct (String code){
        Product product = findProduct(code);
        if(product == null){
            throw new IllegalArgumentException("Product with this code doesn't exist");
        }
        products.remove(product);
    }

    public ArrayList<Product> getProducts(){
        return products;
    }

    public void sellProduct(String code){
        int index = findProductIndex(code);
        if(index == -1){
            throw new IllegalArgumentException("Product with this code doesn't exist");
        }
        products.get(index).decreaseQuantity();
    }
}
