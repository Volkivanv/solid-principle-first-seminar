package lsp2.util;

import lsp2.IOrder;
import lsp2.model.Order;

import java.util.ArrayList;
import java.util.Iterator;

public class OrderCalculator implements Iterable<IOrder> {
    private ArrayList<IOrder> orders;
    public OrderCalculator() {
        orders = new ArrayList<>();
    }

    public void add(IOrder order) {
        orders.add(order);
    }

    public int calcAmount() {
        int sum = 0;
        for (IOrder order : orders) {
            sum += order.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<IOrder> iterator() {
        return orders.iterator();
    }
}
