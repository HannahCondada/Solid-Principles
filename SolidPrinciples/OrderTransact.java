package SolidPrinciples;

import java.util.*;

public class OrderTransact {
    public static void main(String[] args) {

        Map<String, OrderOutput> orderTypes = new HashMap<>();

        //defining customer's order type
        orderTypes.put("WinterMelon Milk Tea", new OrderType());
        orderTypes.put("French Fries", new OrderType());
        orderTypes.put("Steak Diane", new OrderType());

        Customer customer = new Customer(orderTypes);

        //defining customer's order
        Order winterMilkTea = new Order("WinterMelon Milk Tea", "110");
        Order frenchFries = new Order("French Fries", "95");
        Order steakDiane = new Order("Steak Diane", "650");

        customer.custOrder(winterMilkTea);
        customer.custOrder(frenchFries);
        customer.custOrder(steakDiane);


    }
}