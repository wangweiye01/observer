package cc.wangweiye.observe;

// 这个接口时为了提供一个统一的观察者做出相应行为的方法
public interface Observer {
    void update(Observable o);
}
