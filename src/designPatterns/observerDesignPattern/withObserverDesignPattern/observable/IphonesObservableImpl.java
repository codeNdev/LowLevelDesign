package designPatterns.observerDesignPattern.withObserverDesignPattern.observable;

import designPatterns.observerDesignPattern.withObserverDesignPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphonesObservableImpl implements StocksObservable{
    List<NotificationAlertObserver> observerList;
    int stockCount=0;
    public IphonesObservableImpl(){
        observerList=new ArrayList<>();
    }
    /**
     * @param observer
     */
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    /**
     * @param observer
     */
    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    /**
     * @param stockCount
     */
    @Override
    public void updateStockCount(int stockCount) {
        if(this.stockCount!=stockCount){
            this.stockCount=stockCount;
            notifyObservers();
        }
    }

    /**
     *
     */
    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public int getStockCount(){
        return stockCount;
    }
}
