package skyming.designpatterns.strategy;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("挥舞宝剑");
    }
}
