package skyming.designpatterns.strategy;

public class ArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("远程射箭");
    }
}
