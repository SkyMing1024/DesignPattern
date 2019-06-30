package skyming.designpatterns.fSimpleFactory.base;

public class SimpleFactory {
    public static Product createProduct(int param){
        if (param == 1){
            return new ConcreteProduct1();
        }else if (param == 2){
            return new ConcreteProduct2();
        }
        return new ConcreteProduct();
    }
}
