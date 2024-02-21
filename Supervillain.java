package csa.Superhuman;

public class Supervillain extends Superhuman {
    private int anger;

    public Supervillain(String name, String alias, String superpower, String weakness) {
        super(name, alias, superpower, weakness);
        this.anger = 0;
    }

    public int getAnger() {
        return anger;
    }

    public void setAnger(int anger) {
        this.anger = anger;
    }

    @Override
    public void limitStats() {
        super.limitStats();
        if (anger > 100) {
            anger = 100;
        } else if (anger < 0) {
            anger = 0;
        }
    }

    public void attack(Superhero target) {
        int damage = (int) (Math.random() * 11) + 15;
        target.setStamina(target.getStamina() - damage);
        target.setMotivation(target.getMotivation() - 20);
        setStamina(getStamina() - damage);
        limitStats();
        target.limitStats();
    }
}
