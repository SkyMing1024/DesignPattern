package skyming.designpatterns.fSimpleFactory.base;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;

public class Client {
    public static void main(String[] args){
        Product p1 = SimpleFactory.createProduct(1);
        Product p2 = SimpleFactory.createProduct(2);
    }
}
