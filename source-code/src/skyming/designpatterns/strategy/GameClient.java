package skyming.designpatterns.strategy;

public class GameClient {
    public static void main(String[] args){
        Character kight = new Character();
        kight.setWeapon(new SwordBehavior());
        kight.fight();
        kight.setWeapon(new ShieldBehavior());
        kight.fight();
        kight.setWeapon(new ArrowBehavior());
        kight.fight();
    }
}
