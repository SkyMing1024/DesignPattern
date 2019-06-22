package skyming.designpatterns.sigleton;

public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    public Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
