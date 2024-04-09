package designpatterns.prototype;

class Soldier implements Cloneable {

    private int health;
    private int speed;
    private boolean isAvailableForWar;

    public Soldier(int health, int speed, boolean isAvailableForWar) {
        this.health = health;
        this.speed = speed;
        this.isAvailableForWar = isAvailableForWar;
    }

    public void showSoldierInfo() {
        System.out.println("Sağlık : " + health);
        System.out.println("Hız : " + speed);
        if (isAvailableForWar) {
            System.out.println("Savaşmaya hazır!");
        } else {
            System.out.println("Bu asker savaşamaz!");
        }
    }
    @Override
    public Soldier clone() {
        Soldier soldier = null;
        try {
            soldier = (Soldier) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Asker kopyalama sırasında bir hata yaşandı!");
            e.printStackTrace();
        }
        return soldier;
    }

    public void setAvailableForWar(boolean availableForWar) {
        isAvailableForWar = availableForWar;
    }
}
