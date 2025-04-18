package model;

import java.util.List;

public class Order {
    private List<Book> items;
    private String buyer;

    public Order(List<Book> items, String buyer) {
        this.items = items;
        this.buyer = buyer;
    }

    public void printReceipt() {
        System.out.println("Buyer: " + buyer);
        for (Book book : items) {
            book.display();
        }
        System.out.println("Total: " + items.size() + " books");
    }
}
