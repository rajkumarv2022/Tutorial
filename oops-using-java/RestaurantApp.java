import java.util.ArrayList;
import java.util.List;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Menu {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public List<MenuItem> getMenuItems() {
        return items;
    }
}

public class RestaurantApp {
    public static void main(String[] args) {
        Menu restaurantMenu = new Menu();

        MenuItem item1 = new MenuItem("Burger", 9.99);
        MenuItem item2 = new MenuItem("Pizza", 12.99);
        MenuItem item3 = new MenuItem("Salad", 6.99);

        
        restaurantMenu.addItem(item1);
        restaurantMenu.addItem(item2);
        restaurantMenu.addItem(item3);

       
        List<MenuItem> menuItems = restaurantMenu.getMenuItems();
        for (MenuItem item : menuItems) {
            System.out.println("Item: " + item.getName() + ", Price: $" + item.getPrice());
        }
    }
}