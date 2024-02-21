package csa.Superhuman;

public class MarvelSupervillain extends Supervillain {
    public MarvelSupervillain(String name, String alias, String superpower, String weakness, String universe) {
        super(name, alias, superpower, weakness, "Marvel");
    }

    @Override
    public void limitStats() {
        super.limitStats();
        if (getAnger() > 125) {
            setAnger(100);
        } else if (getAnger() < 0) {
            setAnger(0);
        }
    }
}
