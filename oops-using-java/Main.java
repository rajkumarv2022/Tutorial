public class Menu {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem();  // Create a menu item with default attributes
        MenuItem item2 = new MenuItem("Burger");  // Create a menu item with name only
        MenuItem item3 = new MenuItem("Pizza", 9.99);  // Create a menu item with name and price
    }
}
