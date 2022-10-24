public class Planete {
    String name;
    String matter;
    long diameter;
    int totalVisitors;

    Atmosphere atmosphere;

    Vaisseau spaceShipDocked;

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
