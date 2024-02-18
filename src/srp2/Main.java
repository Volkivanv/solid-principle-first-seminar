package srp2;

import srp2.model.Order;
import srp2.model.OrderInputFromConsole;
import srp2.model.SaveJson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter order:");
        Order order = new OrderInputFromConsole().input();
        SaveOrder saveorder = new SaveJson();
        saveorder.saveOrder(order);
    }
}
