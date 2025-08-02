import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product> products;

    public ProductCatalog() {
        products = new ArrayList<>();
        products.add(new Product(1, "Laptop", "Intel i5, 8GB RAM, 512GB SSD", 55000));
        products.add(new Product(2, "Smartphone", "6.5-inch Display, 128GB Storage", 20000));
        products.add(new Product(3, "Headphones", "Noise Cancelling Wireless Headphones", 3000));
        products.add(new Product(4, "Smartwatch", "Fitness tracker with heart rate sensor", 2500));
    }

    public void displayProducts() {
        System.out.println("----- Product Catalog -----");
        for (Product product : products) {
            System.out.println(product + "\n");
        }
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
