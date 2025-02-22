package Observable;


import Observer.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class IphoneObserverImpl implements ObservableInterface {
    public List<ObserverInterface> notificationObserverList=new ArrayList<>();
    int observerCount=0;
    @Override
    public void add(ObserverInterface obj) {
        notificationObserverList.add(obj);
    }

    @Override
    public void remove(ObserverInterface obj) {
        notificationObserverList.remove(obj);
    }

    @Override
    public void notifyObserver() {
       for(ObserverInterface observerInterface:notificationObserverList){
           observerInterface.update();
       }
    }

    @Override
    public void setStockCount(int newObserverCount) {
        if(observerCount==0){
            notifyObserver();
        }
        observerCount+=newObserverCount;
    }

    @Override
    public int getStockCount() {
        return observerCount;
    }
}
