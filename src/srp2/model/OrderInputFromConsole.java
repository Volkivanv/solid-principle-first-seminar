package srp2.model;

import srp2.OrderInput;

import java.util.Scanner;

public class OrderInputFromConsole implements OrderInput {
    @Override
    public Order input() {

        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int quantity = Integer.parseInt(prompt("Quantity: "));
        int price = Integer.parseInt(prompt("Price: "));
        Order order = new Order(clientName, product, quantity, price);
        return order;
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
