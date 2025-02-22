package Observable;

import Observer.ObserverInterface;

public interface ObservableInterface{
    public void add(ObserverInterface obj);
    public void remove(ObserverInterface obj);
    public void notifyObserver();
    public void setStockCount(int observerCount);
    public int getStockCount();
}
