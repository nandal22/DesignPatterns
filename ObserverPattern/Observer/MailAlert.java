package Projects.DesignPatterns.ObserverPattern.Observer;

import Projects.DesignPatterns.ObserverPattern.Observable.IphoneObservable;

public class MailAlert implements INotificationAlertObserver{

    public String email;
    public IphoneObservable iphoneObservable;

    public MailAlert(String email, IphoneObservable iphoneObservable){
        this.email = email;
        this.iphoneObservable = iphoneObservable;
    }

    public void update(){
        sendEmailToUser();
    }

    void sendEmailToUser(){
        System.out.println("Email sent to : " + email);
    }
    
}
