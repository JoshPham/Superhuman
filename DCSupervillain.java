package csa.Superhuman;

public class DCSupervillain extends Supervillain {
    public DCSupervillain(String name, String alias, String superpower, String weakness) {
        super(name, alias, superpower, weakness, "DC");
    }

    @Override
    public void limitStats() { // DC is weaker than Marvel, so the anger limit is 75
        super.limitStats();
        if (getAnger() > 75) {
            setAnger(75);
        } else if (getAnger() < 0) {
            setAnger(0);
        }
        if (getHealth() == 0) {
            destroyJusticeLeague();
        }
    }

    private void destroyJusticeLeague() {
        System.out.println(getAlias() + " is almost dead, but in a last ditch effort, they try to use their superpower to destroy the Justice League!");
        int chance = (int) (Math.random() * 2); // Make destroying the Justice League a 50/50 chance

        if (chance == 0) {
            System.out.println(getAlias() + " has failed to destroy the Justice League!");
        } else {
            System.out.println(getAlias() + " has destroyed the Justice League!");
            System.out.println("The Justice League has been destroyed!");
        }
    }
}
