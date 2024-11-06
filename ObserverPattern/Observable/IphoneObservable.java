package Projects.DesignPatterns.ObserverPattern.Observable;

import Projects.DesignPatterns.ObserverPattern.Observer.INotificationAlertObserver;

public interface IphoneObservable {

    public void add(INotificationAlertObserver notificationAlertObserver);

    public void remove(INotificationAlertObserver notificationAlertObserver);

    public void notifySubscribers();

    public void setCount(int count);

    public int getCount();
}
