package csa.Superhuman;

public class DCSuperhero extends Superhero {
    public DCSuperhero(String name, String alias, String superpower, String weakness, String universe) {
        super(name, alias, superpower, weakness, "DC");
    }

    public void foundJusticeLeague() {
        System.out.println("The Justice League has been formed!");
    }

    public void foundKryptonite() {
        System.out.println("Kryptonite has been found!");
        if (getAlias().equals("Superman") || getAlias().equals("Supergirl") || getAlias().equals("Krypto")) {
            System.out.println(getAlias() + " is now weakened!");
        } else {
            System.out.println("However, " + getAlias() + " is not affected by Kryptonite.");
        }
    }

    public void exploreEarths() {
        String[] earths = {"0", "1", "2", "3", "4", "5", "10"};
        String earth = earths[(int) (Math.random() * earths.length)];
        if (earth.equals("0")) {
            System.out.println(getAlias() + " is now in Earth-0!");
            System.out.println("The main DC universe!");
        } else {
            System.out.println(getAlias() + " is now in Earth " + earth + "!");
        }
    }
}
