package designPatterns.observerDesignPattern.withObserverDesignPattern;

import designPatterns.observerDesignPattern.withObserverDesignPattern.observable.IphonesObservableImpl;
import designPatterns.observerDesignPattern.withObserverDesignPattern.observer.EmailNotificationAlertObserverImpl;
import designPatterns.observerDesignPattern.withObserverDesignPattern.observer.MobileNotificationAlertObserverImpl;
import designPatterns.observerDesignPattern.withObserverDesignPattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        IphonesObservableImpl iphonesObservable=new IphonesObservableImpl();
        NotificationAlertObserver observer1=new EmailNotificationAlertObserverImpl("rituraj123@gmail.com",iphonesObservable);
        NotificationAlertObserver observer2= new MobileNotificationAlertObserverImpl("1234567890",iphonesObservable);
        NotificationAlertObserver observer3= new EmailNotificationAlertObserverImpl("abc@gamil.com",iphonesObservable);
        iphonesObservable.add(observer1);
        iphonesObservable.add(observer2);
        iphonesObservable.add(observer3);
        iphonesObservable.updateStockCount(10);
    }
}
