package csa.Superhuman;

public class Superhero extends Superhuman {
    private int motivation;

    public Superhero(String name, String alias, String superpower, String weakness, String universe) {
        super(name, alias, superpower, weakness, universe);
        this.motivation = 0;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    @Override
    public void limitStats() {
        super.limitStats();
        if (motivation > 100) {
            motivation = 100;
        } else if (motivation < 0) {
            motivation = 0;
        }
    }

    public void train() {
        int stamina = this.getStamina();
        this.setStamina(stamina + 30);
        this.motivation += 20;
    }

    private void attack(Supervillain target) {
        int damage = (int) (Math.random() * 21) + determineDamage();
        target.setStamina(target.getStamina() - damage);
        target.setHealth(target.getHealth() - damage);
        target.setAnger(target.getAnger() - 20);
        super.setStamina(getStamina() - damage);
        limitStats();
        target.limitStats();
    }

    public void rescue(String victim, Supervillain villain, Superhero backup, String location) {
        boolean backupNeeded = false;
        System.out.println(getAlias() + "sees " + victim + " in trouble in a " + location + " and saves them!");
        motivation += 10;

        while (villain.getHealth() > 0 && villain.getAnger() < 100) {
            if (motivation >= 20 && getStamina() > 50) {
                motivation -= 20;
                setStamina(getStamina() - 50);
                attack(villain);
                villain.attack(this);
            } else {
                backupNeeded = true;
                System.out.println(getAlias() + " is too tired to fight " + villain.getAlias() + "!");
                System.out.println("It almost looks like it's over...");
                System.out.println("But wait! " + backup.getAlias() + " comes to the rescue!");
                backup.attack(villain);
                System.out.println(villain.getAlias() + " is too stunned to attack and doesn't do anything!");
                break;
            }
        }
        if (backupNeeded) {
            System.out.println("The day is saved thanks to " + backup.getAlias() + "!");
            System.out.println(victim + " is safe and sound thanks to " + getAlias() + " and " + backup.getAlias() + "!");
        } else {
            System.out.println("The day is saved thanks to " + getAlias() + "!");
        }
    }
}
