public class OrderItem {
    private int orderItemID;
    private int orderID;
    private int bookID;
    private int quantity;
    private double subtotal;

    // Constructors
    public OrderItem(int orderItemID, int orderID, int bookID, int quantity, double subtotal) {
        this.orderItemID = orderItemID;
        this.orderID = orderID;
        this.bookID = bookID;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }

    // Getters and Setters
    public int getOrderItemID() {
        return orderItemID;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getBookID() {
        return bookID;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    // Additional methods as needed
}
