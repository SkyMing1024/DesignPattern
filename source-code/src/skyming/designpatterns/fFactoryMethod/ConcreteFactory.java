package skyming.designpatterns.fFactoryMethod;

import skyming.designpatterns.fSimpleFactory.base.ConcreteProduct;
import skyming.designpatterns.fSimpleFactory.base.Product;

public class ConcreteFactory extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
