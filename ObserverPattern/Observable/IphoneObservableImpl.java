package Projects.DesignPatterns.ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import Projects.DesignPatterns.ObserverPattern.Observer.INotificationAlertObserver;

public class IphoneObservableImpl implements IphoneObservable{

    List<INotificationAlertObserver> observers = new ArrayList<>();
    public int stockCount = 0;

    public void add(INotificationAlertObserver notificationAlertObserver){
        observers.add(notificationAlertObserver);
    }

    public void remove(INotificationAlertObserver notificationAlertObserver){
        observers.remove(notificationAlertObserver);
    }

    public void notifySubscribers(){
        for(INotificationAlertObserver observer: observers){
            observer.update();
        }
    }

    public void setCount(int updatedCount){
        if(stockCount == 0){
            notifySubscribers();
        }

        stockCount = updatedCount;
    }

    public int getCount(){
        return stockCount;
    }
    
}
