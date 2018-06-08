package cc.wangweiye.observe;

import java.util.ArrayList;
import java.util.List;

// 被观察者，它有一个观察者列表，并且有一个通知所有观察者的方法，通知的方式就是调用观察者通用的接口行为update方法
public class Observable {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void changed() {
        System.out.println("==我是被观察者，我发生了变化==");

        // 通知观察我的所有观察者
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
