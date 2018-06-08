package cc.wangweiye.observe.jdk;


import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer {
    private String name;

    public Reader(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 当关注的作者发布新小说时，会通知读者去看
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Writer) {
            Writer writer = (Writer) o;
            System.out.println(name + "知道" + writer.getName() + "发布了新书《" + writer.getLastNovel() + "》非要去看");
        }
    }

    //读者可以关注某一位作者，关注则代表把自己加到作者的观察者列表里
    public void subscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).addObserver(this);
    }

    //读者可以取消关注某一位作者，取消关注则代表把自己从作者的观察者列表里删除
    public void unsubscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).deleteObserver(this);
    }
}
