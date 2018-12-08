package observer;

import java.util.ArrayList;

public class Server implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private String infomation = "";


    public Server() {
    }

    public Server(String infomation) {
        this.infomation = infomation;
    }


    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
        observer.update(infomation);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index > 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o: observers){
            o.update(this.infomation);
        }
    }

    public void setInfomation(String information){
        this.infomation = information;
        this.notifyObserver();
    }
}
