package wz.design.pattern;

/**
 * Singleton
 * 单例模式
 *
 * @author wz
 * @date 16/10/10 11:11
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {

    }
//    方案一
//    1.给 instance 分配内存
//    2.调用 Singleton 的构造函数来初始化成员变量
//    3.将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）
//    2和3可能会指令重排，导致其他线程获得了未初始化的实例，所以采用volatile关键字保证安全
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

    /**
     * 方案二
     * 采用静态内部类的方式，利用JVM自身机制保证线程安全
     */
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
