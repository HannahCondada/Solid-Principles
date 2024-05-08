package SolidPrinciples;

public class OrderType implements OrderOutput {
    @Override
    public void custOrder(Order order, String price) {
        System.out.println("\nCustomer's order is " + order.getOrderType() + ". \nPrice is PHP " + price);
    }
}