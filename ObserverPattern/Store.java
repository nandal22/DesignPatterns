package Projects.DesignPatterns.ObserverPattern;

import Projects.DesignPatterns.ObserverPattern.Observable.IphoneObservable;
import Projects.DesignPatterns.ObserverPattern.Observable.IphoneObservableImpl;
import Projects.DesignPatterns.ObserverPattern.Observer.MailAlert;
import Projects.DesignPatterns.ObserverPattern.Observer.MobileAlert;

public class Store {

    public static void main(String[] args) {
        
        IphoneObservable observable = new IphoneObservableImpl();

        observable.add(new MobileAlert("sachin", observable));
        observable.add(new MobileAlert("subhankar", observable));
        observable.add(new MailAlert("sachin.s", observable));

        observable.setCount(10);
        observable.setCount(0);
        observable.setCount(100);
    }
    
}
