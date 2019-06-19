package skyming.designpatterns.strategy;

public class ShieldBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("盾牌格挡");
    }
}
