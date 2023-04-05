package java9.flow;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class BookPublisher {

    public static void main(String... s) {
        List<Book> bookList = Arrays.asList(new Book(1, "Java 8"), new Book(2, "Java 9")
                , new Book(3, "Java 10"));
        SubmissionPublisher<Book> bookSubmissionPublisher = new SubmissionPublisher<Book>();
        BookSubscriber bookSubscriber = new BookSubscriber("Dave");
        BookSubscriber bookSubscriber1 = new BookSubscriber("John");
        bookSubmissionPublisher.subscribe(bookSubscriber);
        bookSubmissionPublisher.subscribe(bookSubscriber1);
        bookList.stream().forEach(i -> {
            bookSubmissionPublisher.submit(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
