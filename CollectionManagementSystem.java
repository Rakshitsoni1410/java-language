import java.util.*;

class Item {
    int id;
    String name;
    int quantity;

    public Item(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Quantity: " + quantity;
    }
}

class ProductCatalog {
    static Map<Integer, Product> catalog = new HashMap<>();

    public static void addProduct(int id, String name, double price) {
        catalog.put(id, new Product(id, name, price));
    }

    public static void displayProducts() {
        if (catalog.isEmpty()) {
            System.out.println("No products in the catalog.");
        } else {
            catalog.forEach((id, product) -> System.out.println(product));
        }
    }

    public static void updatePrice(int id, double price) {
        Product product = catalog.get(id);
        if (product != null) {
            product.setPrice(price);
            System.out.println("Product price updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    static class Product {
        int id;
        String name;
        double price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product ID: " + id + ", Name: " + name + ", Price: $" + price;
        }
    }
}

public class CollectionManagementSystem {

    static List<Item> items = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Manage Items");
            System.out.println("2. Manage Product Catalog");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageProductCatalog();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void manageItems() {
        while (true) {
            System.out.println("\nItem Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Display Items");
            System.out.println("3. Remove Item");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    displayItems();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addItem() {
        System.out.print("Enter Item ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Item Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Item Quantity: ");
        int quantity = scanner.nextInt();

        items.add(new Item(id, name, quantity));
        System.out.println("Item added successfully.");
    }

    private static void displayItems() {
        if (items.isEmpty()) {
            System.out.println("No items available.");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    private static void removeItem() {
        System.out.print("Enter Item ID to remove: ");
        int id = scanner.nextInt();

        items.removeIf(item -> item.id == id);
        System.out.println("Item removed successfully.");
    }

    private static void manageProductCatalog() {
        while (true) {
            System.out.println("\nProduct Catalog Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product Price");
            System.out.println("3. Display Products");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProductPrice();
                    break;
                case 3:
                    ProductCatalog.displayProducts();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();

        ProductCatalog.addProduct(id, name, price);
        System.out.println("Product added successfully.");
    }

    private static void updateProductPrice() {
        System.out.print("Enter Product ID to update price: ");
        int id = scanner.nextInt();
        System.out.print("Enter new price: ");
        double price = scanner.nextDouble();

        ProductCatalog.updatePrice(id, price);
    }
}
