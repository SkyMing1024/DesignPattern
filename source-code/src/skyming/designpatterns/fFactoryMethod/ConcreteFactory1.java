package skyming.designpatterns.fFactoryMethod;

import skyming.designpatterns.fSimpleFactory.base.ConcreteProduct1;
import skyming.designpatterns.fSimpleFactory.base.Product;

public class ConcreteFactory1 extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
