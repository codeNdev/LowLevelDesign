package designPatterns.observerDesignPattern.withObserverDesignPattern.observable;

import designPatterns.observerDesignPattern.withObserverDesignPattern.observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void updateStockCount(int stockCount);
    void notifyObservers();
    int getStockCount();
}
