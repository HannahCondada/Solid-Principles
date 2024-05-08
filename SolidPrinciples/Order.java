package SolidPrinciples;

public class Order {
    private final String orderType;
    private final String price;

    public Order(String orderType, String price) {
        this.orderType = orderType;
        this.price = price;
    }

    public String getOrderType() {
        return orderType;
    }

    public String getPrice() {
        return price;
    }
}