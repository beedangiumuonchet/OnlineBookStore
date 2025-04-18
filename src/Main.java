import factory.BookFactory;
import factory.BookType;
import factory.PaymentFactory;
import model.Book;
import model.PaymentMethod;
import singleton.BookManager;
import singleton.Logger;
import singleton.OrderManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookManager manager = BookManager.getInstance();
        Logger logger = Logger.getInstance();

        // Tạo sách bằng Factory
        Book book1 = BookFactory.createBook("Ben nhau tron doi", "Co Man", 2020, BookType.AUDIO);
        Book book2 = BookFactory.createBook("Mai mai la bao xa ", "Diep Lac Vo Tam", 2017, BookType.PAPER);
        Book book3 = BookFactory.createBook("All in love", "Co Tay Tuoc", 2016, BookType.EBOOK);
        Book book4 = BookFactory.createBook("Yeu em tu cai nhin dau tien", "Co Man", 2019, BookType.AUDIO);
        Book book5 = BookFactory.createBook("Vung trom yeu anh", "Trac Di", 2021, BookType.PAPER);

        // Quản lý sách bằng Singleton BookManager
        manager.addBook(book1);
        manager.addBook(book2);
        manager.addBook(book3);
        manager.addBook(book4);
        manager.addBook(book5);

        // Hiển thị sách
        for (Book book : manager.getBooks()) {
            book.display();
        }

        logger.log("Total books managed: " + manager.getBooks().size());

        // Đặt đơn hàng
        OrderManager.getInstance().createOrder(List.of(book2, book5), "Customer: My Duyen");

        // Thanh toán đơn hàng
        PaymentMethod payment = PaymentFactory.createPayment("momo");
        payment.pay(350_000);  // Ví dụ giá
    }
}
