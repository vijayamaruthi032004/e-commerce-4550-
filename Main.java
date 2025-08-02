import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n----- E-Commerce Menu -----");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    catalog.displayProducts();
                    break;
                case 2:
                    System.out.print("Enter Product ID to add: ");
                    int id = scanner.nextInt();
                    Product selected = catalog.getProductById(id);
                    if (selected != null) {
                        System.out.print("Enter quantity: ");
                        int qty = scanner.nextInt();
                        cart.addProduct(selected, qty);
                        System.out.println(qty + " x " + selected.getName() + " added to cart.");
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    System.out.println("Thank you for shopping!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
