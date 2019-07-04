package skyming.designpatterns.fAbstractFactory;

public class Client {
    public static void main(String[] args){
            CarFactory benzFactory = new BenzFactory();
            Car car = benzFactory.createSedanCar();
            car.run();
    }
}
