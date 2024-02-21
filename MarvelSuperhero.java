package csa.Superhuman;

public class MarvelSuperhero extends Superhero {
    public MarvelSuperhero(String name, String alias, String superpower, String weakness) {
        super(name, alias, superpower, weakness, "Marvel");
    }

    public void foundAvengers() {
        System.out.println(getAlias() + " has joined the Avengers!");
    }

    public void foundHammer() {
        System.out.println("Mjolnir has been found!");
        if (getAlias().equals("Thor")) {
            System.out.println(getAlias() + " is now worthy!");
        } else {
            System.out.println("However, " + getAlias() + " is not worthy of Mjolnir.");
        }
    }

    public void exploreEarths() {
        String[] earths = {"616", "1610", "199999",
                            "12041", "928", "2149", 
                            "8311", "982", "20051", 
                            "200080", "200111", "200500", 
                            "200501", "200503", "200505", 
                            "200513", "200515", "200517", 
                            "200518", "200519", "200520"};

        String earth = earths[(int) (Math.random() * earths.length)];
        if (earth.equals("616")) {
            System.out.println(getAlias() + " is now in Earth-616!");
            System.out.println("The main Marvel universe!");
        } else {
            System.out.println(getAlias() + " is now in Earth " + earth + "!");
        }
    }
}
