package skyming.designpatterns.fFactoryMethod;

import skyming.designpatterns.fSimpleFactory.base.Product;

import java.util.Calendar;

public class Client {
    Factory factory = new ConcreteFactory1();
    Product p1 = factory.factoryMethod();

}
