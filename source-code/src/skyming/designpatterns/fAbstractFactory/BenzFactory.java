package skyming.designpatterns.fAbstractFactory;

public class BenzFactory extends CarFactory{
    @Override
    SedanCar createSedanCar() {
        SedanCar c = new BenzSedanCar();
        return c;
    }

    @Override
    SportsCar createSportsCar() {
        SportsCar s = new BenzSportsCar();
        return s;
    }

    @Override
    ElectricCar createElectricCar() {
        ElectricCar e = new BenzElectricCar();
        return e;
    }
}
