package ClassandObjects;

public class CartItem {

        String itemName;
        double price;
        int quantity;

        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        void addItem(int qty) {
            quantity += qty;
            System.out.println(qty + " more " + itemName + " added.");
        }

        void removeItem(int qty) {
            if (qty <= quantity) {
                quantity -= qty;
                System.out.println(qty + " " + itemName + " removed.");
            } else {
                System.out.println("Not enough quantity to remove.");
            }
        }

        double totalCost() {
            return price * quantity;
        }

        void displayCart() {
            System.out.println("Item: " + itemName);
            System.out.println("Price per unit: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: ₹" + totalCost());
        }

        public static void main(String[] args) {
            CartItem cart = new CartItem("Notebook", 50, 2);
            cart.displayCart();
            cart.addItem(3);
            cart.removeItem(1);
            cart.displayCart();
        }
    }

