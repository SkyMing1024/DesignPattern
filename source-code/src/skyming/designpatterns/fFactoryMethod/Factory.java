package skyming.designpatterns.fFactoryMethod;

import skyming.designpatterns.fSimpleFactory.base.Product;

public abstract class Factory {
    public abstract Product factoryMethod();
    public void doSomething(){
        Product product = factoryMethod();
        System.out.println("doSomething");
    }
}
