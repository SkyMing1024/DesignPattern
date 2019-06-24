package skyming.designpatterns.sigleton;

/**
 * 静态内部类
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 SINGLETON_5 = new Singleton5();
    }
    private Singleton5() {
    }
    private static final Singleton5 getInstance(){
        return SingletonHolder.SINGLETON_5;
    }
}
