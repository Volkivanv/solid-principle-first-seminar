package lsp2.model;

import lsp2.IOrder;

public class OrderBonus implements IOrder {
    int quantity;
    int price;

    public OrderBonus(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public int getAmount() {
        return 0;
    }
}
