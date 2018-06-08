package cc.wangweiye.observe.jdk;

import java.util.HashMap;
import java.util.Map;

public class WriterManager {
    private static WriterManager writerManager;

    private Map<String, Writer> writerMap = new HashMap<>();

    // 添加作者
    public void add(Writer writer) {
        writerMap.put(writer.getName(), writer);
    }

    // 根据作者名获得作者
    public Writer getWriter(String name) {
        return writerMap.get(name);
    }

    // 单例模式(私有构造函数)
    private WriterManager() {

    }

    public static WriterManager getInstance() {
        if (writerManager == null) {
            synchronized (WriterManager.class) {
                if (writerManager == null) {
                    writerManager = new WriterManager();
                }
            }
        }

        return writerManager;
    }
}
