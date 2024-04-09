package designpatterns.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Soldier soldier = new Soldier(100, 50, true);
        soldier.showSoldierInfo();

        Soldier newSoldier = soldier.clone();
        newSoldier.setAvailableForWar(false);
        newSoldier.showSoldierInfo();
    }
}
