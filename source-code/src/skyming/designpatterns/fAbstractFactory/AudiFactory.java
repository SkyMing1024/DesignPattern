package skyming.designpatterns.fAbstractFactory;

public class AudiFactory extends CarFactory{
    @Override
    SedanCar createSedanCar() {
        SedanCar c = new AudiSedanCar();
        return c;
    }

    @Override
    SportsCar createSportsCar() {
        SportsCar s = new AudiSportsCar();
        return s;
    }
}
