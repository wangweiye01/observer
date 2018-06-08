package cc.wangweiye.observe;

public class ConcreteObserver1 implements Observer {
    @Override
    public void update(Observable o) {
        System.out.println("观察者1观察到" + o.getClass().getSimpleName() + "发生变化");
        System.out.println("观察者1做出相应变化");
    }
}
