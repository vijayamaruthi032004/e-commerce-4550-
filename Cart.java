import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getId() == product.getId()) {
                // Item already in cart, increase quantity
                int newQty = item.getQuantity() + quantity;
                items.remove(item);
                items.add(new CartItem(product, newQty));
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("\nItems in your cart:");
        double total = 0;
        for (CartItem item : items) {
            System.out.println(item);
            total += item.getTotalPrice();
        }
        System.out.println("Total: ₹" + total);
    }
}
