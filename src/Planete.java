public class Planete {
    String name;
    String matter;
    long diameter;
    int totalVisitors;
    static String shape = "Sphérique";
    static int nbPlanetsDiscovered;

    Atmosphere atmosphere;

    Vaisseau spaceShipDocked;

    Planete (String name) {
        this.name = name;
        nbPlanetsDiscovered++;
    }

    static String expansion (double distance) {
        if (distance < 14) {
            return "Oh là là, mais c'est super rapide";
        }
        else {
            return "Je rêve ou c'est plus rapide que la lumière";
        }
    }

    int revolution(int angle){
        return angle/360;
    }

    int rotation(int angle){
        return angle/360;
    }

    Vaisseau welcomeSpaceship(Vaisseau newSpaceShip) {
        totalVisitors += newSpaceShip.nbPeople;

        Vaisseau previousSpaceShip = spaceShipDocked;
        spaceShipDocked = newSpaceShip;

        return previousSpaceShip;
    }

}
