import java.util.ArrayList;
import java.util.List;

public class RestaurantOrderingSystem {
    public static void main(String[] args) {
        RestaurantMenu menu = new RestaurantMenu();
        
        // Create different menu items using overloaded constructors
        MenuItem appetizer = new Appetizer("Mozzarella Sticks", 6.99, "Delicious mozzarella sticks with marinara sauce.");
        MenuItem mainCourse = new MainCourse("Spaghetti Carbonara", 12.99, "Creamy pasta with bacon and eggs.");
        MenuItem dessert = new Dessert("Tiramisu", 5.99, "Classic Italian dessert with coffee flavor.");
        MenuItem drink = new Drinks("Soda", 2.49, "Choice of cola, root beer, or lemon-lime.");
        
        // Add menu items to the menu
        menu.addItem(appetizer);
        menu.addItem(mainCourse);
        menu.addItem(dessert);
        menu.addItem(drink);
        
        // Display the menu
        menu.displayMenu();
    }
}

class MenuItem {
    private String name;
    private double price;
    
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // Getters and setters for name and price
    
    // Other methods as needed
}

class Appetizer extends MenuItem {
    private String description;
    
    public Appetizer(String name, double price, String description) {
        super(name, price);
        this.description = description;
    }
    
    // Getters and setters for description
    
    // Other methods as needed
}

class MainCourse extends MenuItem {
    private String description;
    
    public MainCourse(String name, double price, String description) {
        super(name, price);
        this.description = description;
    }
    
    // Getters and setters for description
    
    // Other methods as needed
}

class Dessert extends MenuItem {
    private String description;
    
    public Dessert(String name, double price, String description) {
        super(name, price);
        this.description = description;
    }
    
    // Getters and setters for description
    
    // Other methods as needed
}

class Drinks extends MenuItem {
    private String description;
    
    public Drinks(String name, double price, String description) {
        super(name, price);
        this.description = description;
    }
    
    // Getters and setters for description
    
    // Other methods as needed
}

class RestaurantMenu {
    private List<MenuItem> menuItems;
    
    public RestaurantMenu() {
        menuItems = new ArrayList<>();
    }
    
    public void addItem(MenuItem item) {
        menuItems.add(item);
    }
    
    public void displayMenu() {
        System.out.println("Menu:");
        for (MenuItem item : menuItems) {
            System.out.println(item.getName() + " - $" + item.getPrice());
            System.out.println("Description: " + item.getDescription());
            System.out.println();
        }
    }
    
    // Other methods for searching, modifying, or managing the menu
}
