package java9.flow;

import java.util.concurrent.Flow;

public class BookSubscriber implements Flow.Subscriber<Book> {

    private final String subscriberName;
    private Flow.Subscription subscription;

    public BookSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Book item) {
        subscription.request(1);
        System.out.println(item + ", received by: " + this.subscriberName);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(throwable.getMessage());

    }

    @Override
    public void onComplete() {
        System.out.println(subscriberName + "got all books ");
    }
}
