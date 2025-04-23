import java.util.Date;

public class Order {
    private int orderID;
    private int userID;
    private Date orderDate;
    private double totalAmount;

    // Constructors
    public Order(int orderID, int userID, Date orderDate, double totalAmount) {
        this.orderID = orderID;
        this.userID = userID;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    // Getters and Setters
    public int getOrderID() {
        return orderID;
    }

    public int getUserID() {
        return userID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // Additional methods as needed
}
