package skyming.designpatterns.strategy;

public class Character {
    WeaponBehavior weapon;
    public void setWeapon(WeaponBehavior w){
        this.weapon = w;
    }
    public void fight(){
        if (weapon != null){
            weapon.useWeapon();
        }
    }
}

