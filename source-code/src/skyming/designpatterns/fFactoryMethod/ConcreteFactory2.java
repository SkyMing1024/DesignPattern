package skyming.designpatterns.fFactoryMethod;

import skyming.designpatterns.fSimpleFactory.base.ConcreteProduct2;
import skyming.designpatterns.fSimpleFactory.base.Product;

public class ConcreteFactory2 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
