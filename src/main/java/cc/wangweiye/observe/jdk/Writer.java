package cc.wangweiye.observe.jdk;

import java.util.Observable;

public class Writer extends Observable {
    private String name; // 作者名称

    private String lastNovel; //作者最新发布的小说

    public String getName() {
        return this.name;
    }

    public Writer(String name) {
        super();
        this.name = name;
        WriterManager.getInstance().add(this);
    }

    // 作者发布新小说，要通知所有关注自己的读者
    public void addNovel(String novel) {
        System.out.println(name + "发布了新书《" + novel + "》");

        lastNovel = novel;

        setChanged();

        notifyObservers();
    }

    public String getLastNovel() {
        return this.lastNovel;
    }
}
