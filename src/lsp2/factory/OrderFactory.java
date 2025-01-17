package lsp2.factory;

import lsp2.IOrder;
import lsp2.model.Order;
import lsp2.model.OrderBonus;

public class OrderFactory {
    public IOrder create(int quantity, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(quantity, price);
        }
        return new Order(quantity, price);
    }
}
