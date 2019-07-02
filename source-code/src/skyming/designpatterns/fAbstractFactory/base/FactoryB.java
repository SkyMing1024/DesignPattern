package skyming.designpatterns.fAbstractFactory;

public class FactoryB extends AbstractFactory{
    @Override
    AbstracProduct1 createProduct1() {
        return new ProductB1();
    }

    @Override
    AbstracProduct2 createProduct2() {
        return new ProductB2();
    }
}
