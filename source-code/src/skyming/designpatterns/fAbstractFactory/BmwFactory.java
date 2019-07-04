package skyming.designpatterns.fAbstractFactory;

public class BmwFactory extends CarFactory{
    @Override
    SedanCar createSedanCar() {
        SedanCar c = new BmwSedanCar();
        return c;
    }

    @Override
    SportsCar createSportsCar() {
        SportsCar s = new BmwSportsCar();
        return s;
    }
}
