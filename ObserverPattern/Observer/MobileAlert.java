package Projects.DesignPatterns.ObserverPattern.Observer;

import Projects.DesignPatterns.ObserverPattern.Observable.IphoneObservable;

public class MobileAlert implements INotificationAlertObserver{

    String username;
    IphoneObservable iphoneObservable;

    public MobileAlert(String username, IphoneObservable iphoneObservable){
        this.username = username;
        this.iphoneObservable = iphoneObservable;
    }

    public void update(){
        sendMobileAlert();
    }

    void sendMobileAlert(){
        System.out.println("Alert sent to : " + username);
    }
    
}
