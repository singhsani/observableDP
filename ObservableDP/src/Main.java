import Observable.IphoneObserverImpl;
import Observable.ObservableInterface;
import Observer.NotificationObserver;

public class Main {
    public static void main(String[] args) {
        ObservableInterface observableInterface = new IphoneObserverImpl();
        NotificationObserver notificationObserver=new NotificationObserver("xyz@gmail.com",observableInterface);
        NotificationObserver notificationObserver1=new NotificationObserver("xyz@gmail.com",observableInterface);
        NotificationObserver notificationObserver2=new NotificationObserver("xyz@gmail.com",observableInterface);
        NotificationObserver notificationObserver3=new NotificationObserver("xyz@gmail.com",observableInterface);

        observableInterface.add(notificationObserver);
        observableInterface.add(notificationObserver1);
        observableInterface.add(notificationObserver2);
        observableInterface.add(notificationObserver3);

        observableInterface.setStockCount(10);
        System.out.println("Hello, World!");
    }
}