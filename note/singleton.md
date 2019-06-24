### 单例模式 Singleton Pattern
#### 定义
单例模式确保某一个类只有一个实例，而且自行实例化，并向整个系统提供这个实例。这个类称为单例类。
关键点：
* 单例类只有一个实例
* 此实例自行创建
* 提供全局访问方法

#### 实现
单例模式有多种实现方式，但都是基于上文提到的三个要点，实现时也有三个要点：
* 单例类有一个自身的**静态私有**成员变量 ———— 存储唯一实例
* 单例类的构造方法为**私有**private ———— 确保无法通过new直接实例化
* 提供一个public**公有**的静态工厂方法 ———— 校验实例是否存在并实例化它  

下面介绍几种单例模式的经典实现方法
##### 1. 懒汉模式（线程不安全）
* 懒加载初始化
* 线程不安全  
类加载时没有初始化类，获取时才初始化，属于懒加载。
多线程下，会产生多个实例，线程不安全。
```Java
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy() {
    }
    public static SingletonLazy getInstance(){
        if (instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
```

##### 2. 懒汉模式（线程安全）
* 懒加载初始化
* 线程安全
能够在多线程下工作，synchronized可以保证单例，但是效率较低。
```Java
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
```
两种懒汉方式总结：
优点：第一次调用时才初始化，避免浪费内存
缺点：多线程支持不好

##### 3. 饿汉模式
* 非懒加载
* 线程安全
这种方式类加载时较慢，但获取对象较快。基于类加载机制避免了多线程的同步问题，但是导致类加载的方式有很多
优点：不用加锁就支持多线程，执行效率较高
缺点：类加载时就初始化，容易产生垃圾对象，浪费内存
```Java
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3() {
    }
    public static Singleton3 getInstance() {
        return instance;
    }
}
```

##### 4. 双重校验
```Java
public class Singleton4 {
    private volatile static Singleton4 instance;
    private Singleton4() {
    }
    public static Singleton4 getInstance() {
        if (instance == null){
            synchronized (Singleton4.class){
                if (instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
```


##### 5. 静态内部类 
```Java
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
```

##### 6. 枚举
```Java
public enum Singleton6 {
    INSTANCE;
    public void method(){}
}
```
#### 优点


#### 缺点

#### 应用

#### 参考
[菜鸟教程-单例模式](https://www.runoob.com/design-pattern/singleton-pattern.html)  
[Graphic Design Patterns - Signleton Pattern(中文)](https://design-patterns.readthedocs.io/zh_CN/latest/read_uml.html#id1)

