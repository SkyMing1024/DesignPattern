package skyming.designpatterns.sigleton;

/**
 * 懒汉模式（线程安全）
 */
public class SingletonLazy2 {
    private static SingletonLazy2 instance;
    private SingletonLazy2() {
    }
    public static synchronized SingletonLazy2 getInstance(){
        if (instance == null){
            instance = new SingletonLazy2();
        }
        return instance;
    }
}
