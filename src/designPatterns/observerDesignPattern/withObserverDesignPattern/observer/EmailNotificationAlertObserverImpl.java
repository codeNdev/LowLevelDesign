package designPatterns.observerDesignPattern.withObserverDesignPattern.observer;

import designPatterns.observerDesignPattern.withObserverDesignPattern.observable.StocksObservable;

public class EmailNotificationAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StocksObservable stocksObservable;
    public EmailNotificationAlertObserverImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail("new stock count is "+stocksObservable.getStockCount());
    }
    void sendEmail(String message){
        System.out.println("Sending email to "+emailId+" with message: "+message);
    }
}
