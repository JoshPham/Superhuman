package csa.Superhuman;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MarvelSuperhero spiderMan = new MarvelSuperhero("Peter Parker", "Spider Man", "Web Slinging", "Water");
        MarvelSuperhero ironMan = new MarvelSuperhero("Tony Stark", "Iron Man", "Super Strength", "Fire");
        MarvelSuperhero thor = new MarvelSuperhero("Thor Odinson", "Thor", "God of Thunder", "Mortality");

        DCSuperhero superman = new DCSuperhero("Clark Kent", "Superman", "Super Strength", "Kryptonite", "DC");
        DCSuperhero batman = new DCSuperhero("Bruce Wayne", "Batman", "Super Intelligence", "Mortality", "DC");
        DCSuperhero wonderWoman = new DCSuperhero("Diana Prince", "Wonder Woman", "Super Strength", "Mortality", "DC");

        MarvelSupervillain loki = new MarvelSupervillain("Loki Laufeyson", "Loki", "God of Mischief", "Mortality");
        MarvelSupervillain thanos = new MarvelSupervillain("Thanos", "Thanos", "Infinity Gauntlet", "Mortality");
        MarvelSupervillain ultron = new MarvelSupervillain("Ultron", "Ultron", "Super Intelligence", "Mortality");

        DCSupervillain joker = new DCSupervillain("Unknown", "Joker", "Super Intelligence", "Mortality");
        DCSupervillain lexLuthor = new DCSupervillain("Unknown", "Lex Luthor", "Super Intelligence", "Mortality");
        DCSupervillain darkseid = new DCSupervillain("Unknown", "Darkseid", "Super Strength", "Mortality");

        String[] marvelLocations = {"New York", "Asgard", "Sokovia", "Wakanda", "Xandar", "Knowhere", "Titan", "Vormir", "Nidavellir", "Ego"};
        String[] dcLocations = {"Gotham", "Metropolis", "Central City", "Star City", "National City", "Coast City", "Bludhaven", "Smallville", "Themyscira", "Apokolips"};

        ArrayList<MarvelSuperhero> avengers = new ArrayList<MarvelSuperhero>();
        avengers.add(spiderMan);
        avengers.add(ironMan);
        avengers.add(thor);

        ArrayList<DCSuperhero> justiceLeague = new ArrayList<DCSuperhero>();
        justiceLeague.add(superman);
        justiceLeague.add(batman);
        justiceLeague.add(wonderWoman);

        ArrayList<MarvelSupervillain> marvelVillains = new ArrayList<MarvelSupervillain>();
        marvelVillains.add(loki);
        marvelVillains.add(thanos);
        marvelVillains.add(ultron);

        ArrayList<DCSupervillain> dcVillains = new ArrayList<DCSupervillain>();
        dcVillains.add(joker);
        dcVillains.add(lexLuthor);
        dcVillains.add(darkseid);
        
        ironMan.foundAvengers();

        for (int i = 0; i < 10; i++){
            int universeIndex = (int) (Math.random());
            int heroIndex = (int) (Math.random() * 3);
            int backupHeroIndex = 2 - heroIndex;
            int villainIndex = (int) (Math.random() * 3);
            String marvelLocation = marvelLocations[(int) (Math.random() * marvelLocations.length)];
            String dcLocation = dcLocations[(int) (Math.random() * dcLocations.length)];

            String[] victims = {"Josh", "John", "Jacob", "Jingleheimer", "Schmidt"}; // People that the villains can attack
            String victim = victims[(int) (Math.random() * victims.length)];
            
            if (universeIndex == 0){
                MarvelSuperhero currentHero = avengers.get(heroIndex);
                currentHero.exploreEarths();
                currentHero.foundHammer();
                currentHero.train();
                currentHero.rescue(victim, marvelVillains.get(villainIndex), avengers.get(backupHeroIndex), marvelLocation);

            } else {
                DCSuperhero currentHero = justiceLeague.get(heroIndex);
                currentHero.exploreEarths();
                currentHero.foundKryptonite();
                currentHero.train();
                currentHero.rescue(victim, dcVillains.get(villainIndex), justiceLeague.get(backupHeroIndex), dcLocation);
            }
        }

    }
}
