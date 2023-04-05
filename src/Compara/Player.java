package Compara;

import java.nio.file.CopyOption;

// TODO 1.2: Augment the class constructor to implement Comparable.
// TODO 1.5: Remove the code added in TODO 1.2
public class Player {
    private String ign;
    private int hp;
    private int damage;

    // ------------------------------
    // Constructor
    // ------------------------------
    public Player(String ign, int hp, int damage) {
        this.ign = ign;
        this.hp = hp;
        this.damage = damage;
    }

    // TODO 1.3: Implement compareTo() to satisfy the Comparable interface. Make it so that the player with the larger hp is considered greater than the player with lesser hp.
    // TODO 1.6: Comment out the code added in TODO 1.3




    // ------------------------------
    // Generic toString() override
    // ------------------------------
    @Override
    public String toString() {
        return "Player{" +
                "ign='" + ign + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }

    // ------------------------------
    // Getters and Setters Below...
    // ------------------------------

    public String getIgn() {
        return ign;
    }

    public void setIgn(String ign) {
        this.ign = ign;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


}
