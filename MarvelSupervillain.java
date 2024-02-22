package csa.Superhuman;

public class MarvelSupervillain extends Supervillain {
    public MarvelSupervillain(String name, String alias, String superpower, String weakness) {
        super(name, alias, superpower, weakness, "Marvel");
    }

    public void snap(Superhero target) {
        int chance = (int) (Math.random()); // Make snapping people out of existence a 50/50 chance

        if (!getAlias().equals("Thanos")) { // Only Thanos can snap people out of existence
            chance = 1;
        }

        if (chance == 0) {
            System.out.println(getAlias() + " has snapped " + target.getAlias() + " out of existence!");
            setAnger(getAnger() - 10);
            setHealth(0);
            target.setHealth(0);
        } else {
            System.out.println(getAlias() + " has failed to snap " + target.getAlias() + " out of existence!");
            setAnger(getAnger() + 20);
            target.setMotivation(target.getMotivation() + 30);
        }
    }

    @Override
    public void limitStats() { // Marvel is stronger than DC, so the anger limit is 125
        super.limitStats();
        if (getAnger() > 125) {
            setAnger(125);
        } else if (getAnger() < 0) {
            setAnger(0);
        }
    }
}
