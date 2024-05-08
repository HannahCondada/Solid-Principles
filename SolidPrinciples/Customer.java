package SolidPrinciples;

import java.util.*;

public class Customer {
    private final Map<String, OrderOutput> orderTypes = new HashMap<>();

    public Customer(Map<String, OrderOutput> orderTypes){
        this.orderTypes.putAll(orderTypes);
    }

    public void custOrder(Order order) {
        String custOrderType = order.getOrderType();

        OrderOutput ordOut = orderTypes.get(custOrderType);
        ordOut.custOrder(order, order.getPrice());
    }
}