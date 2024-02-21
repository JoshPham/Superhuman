package csa.Superhuman;

public class Superhuman {
    private String name;
    private String alias;
    private int health;
    private int stamina;
    private String superpower;
    private String weakness;
    private String universe;

    public Superhuman(String name, String alias, String superpower, String weakness, String universe) {
        this.name = name;
        this.alias = alias;
        this.health = 100;
        this.stamina = 100;
        this.superpower = superpower;
        this.weakness = weakness;
        this.universe = universe;
    }
    
    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    } 

    public int getStamina() {
        return stamina;
    }

    public int getHealth() {
        return health;
    }

    public String getSuperpower() {
        return superpower;
    }

    public String getWeakness() {
        return weakness;
    }
    public String getUniverse() {
        return universe;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int determineDamage() {
        int baseDamage = 10;
        if (superpower.equals(weakness)) {
            baseDamage = 0;
        } else if (superpower.equals("flight") || superpower.equals("super strength")) {
            baseDamage = 20;
        } else if (superpower.equals("telekinesis") || superpower.equals("telepathy")) {
            baseDamage = 15;
        } else if (superpower.equals("super speed") || superpower.equals("invisibility")) {
            baseDamage = 10;
        } else {
            baseDamage = 5;
        }

        if (universe.equals("Marvel")) {
            baseDamage += 5;
        }
        
        return baseDamage;
    }

    public void limitStats() {
        if (stamina > 100) {
            stamina = 100;
        } else if (stamina < 0) {
            stamina = 0;
        }

        if (health > 100) {
            health = 100;
        } else if (health < 0) {
            health = 0;
        }
    }
}