package designPatterns.observerDesignPattern.withObserverDesignPattern.observer;

import designPatterns.observerDesignPattern.withObserverDesignPattern.observable.StocksObservable;

public class MobileNotificationAlertObserverImpl implements NotificationAlertObserver{
    String mobileNumber;
    StocksObservable stocksObservable;
    public MobileNotificationAlertObserverImpl(String mobileNumber,StocksObservable stocksObservable){
        this.mobileNumber=mobileNumber;
        this.stocksObservable=stocksObservable;
    }
    @Override
    public void update() {
        sendMobileNotification("Now Socks are available with Stock Count :"+stocksObservable.getStockCount());
    }
    void sendMobileNotification(String message){
        System.out.println("Sending mobile notification to "+mobileNumber+" with message: "+message);
    }
}
