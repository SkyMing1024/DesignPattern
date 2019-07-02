package skyming.designpatterns.fAbstractFactory;

public abstract class CarFactory {
    abstract SedanCar createSedanCar();
    abstract SportsCar createSportsCar();
}
