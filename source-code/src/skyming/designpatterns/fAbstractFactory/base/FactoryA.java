package skyming.designpatterns.fAbstractFactory;

public class FactoryA extends AbstractFactory{
    @Override
    AbstracProduct1 createProduct1() {
        return new ProductA1();
    }

    @Override
    AbstracProduct2 createProduct2() {
        return new ProductA2();
    }
}
