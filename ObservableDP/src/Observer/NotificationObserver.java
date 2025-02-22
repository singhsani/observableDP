package Observer;

import Observable.ObservableInterface;

public class NotificationObserver implements ObserverInterface{
    String email;
    ObservableInterface observableInterface;
    public NotificationObserver(String email,ObservableInterface observableInterface1){
        this.email=email;
        this.observableInterface=observableInterface1;
    }
    @Override
    public void update() {
        sendEmail(email);
    }

    private void sendEmail(String email) {
        System.out.println("email send Successfully....");
    }
}
