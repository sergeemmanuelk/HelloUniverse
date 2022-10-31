public class HelloUniverse {
    public static void main(String[] args){
        Planete mercure = new Planete("Mercure");
        mercure.diameter = 4880;
        mercure.matter = "Tellurique";

        Planete venus = new Planete("Venus");
        venus.diameter = 12100;
        venus.matter = "Tellurique";

        Planete terre = new Planete("Terre");
        terre.diameter = 12756;
        terre.matter = "Tellurique";

        Planete mars = new Planete("Mars");
        mars.diameter = 6792;
        mars.matter = "Tellurique";

        Planete jupiter = new Planete("Jupiter");
        jupiter.diameter = 142984;
        jupiter.matter = "Gazeuse";

        Planete saturne = new Planete("Saturne");
        saturne.diameter = 120536;
        saturne.matter = "Gazeuse";

        Planete uranus = new Planete("Uranus");
        uranus.diameter = 51118;
        uranus.matter = "Gazeuse";

        Planete neptune = new Planete("Neptune");
        neptune.diameter = 49532;
        neptune.matter = "Gazeuse";

        Atmosphere atmosphereUranus = new Atmosphere();

        atmosphereUranus.hydrogenRate = 83f;
        atmosphereUranus.heliumRate = 15f;
        atmosphereUranus.methaneRate = 2.5f;

        uranus.atmosphere = atmosphereUranus;

        System.out.println(jupiter.name + " est une planète " + jupiter.matter + " avec un diamètre de " + jupiter.diameter + " kilomètres.");

        System.out.println("Neptune a effectué " + neptune.revolution(-3542) + " autour de son étoile");

        System.out.println("Mars a effectué " + mars.rotation(-684)+ " sur elle même");

        System.out.println("Venus a effectué " + venus.rotation(1250)+ " sur elle même");

        Vaisseau firstSpaceShip = new Vaisseau();

        firstSpaceShip.type = "FRIGATE";
        firstSpaceShip.nbPeople = 9;

        Vaisseau outGoing = mars.welcomeSpaceship(firstSpaceShip);
        if (outGoing == null) {
            System.out.println("Aucun vaisseau ne s'en va.");
        }
        else {
            System.out.println("Un vaisseau de type " + outGoing.type + " doit s'en aller.");
        }

        Vaisseau secondSpaceShip = new Vaisseau();

        secondSpaceShip.type = "CRUISER";
        secondSpaceShip.nbPeople = 42;

        outGoing = mars.welcomeSpaceship(secondSpaceShip);

        if (outGoing == null) {
            System.out.println("Aucun vaisseau ne s'en va.");
        }
        else {
            System.out.println("Un vaisseau de type " + outGoing.type + " doit s'en aller.");
        }

        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de " + mars.totalVisitors + ".");

        System.out.println("L'atmosphère de Uranus est composée :");
        System.out.println("A "+uranus.atmosphere.hydrogenRate+"% d'hydrogène");
        System.out.println("A "+uranus.atmosphere.argonRate+"% d'argon");
        System.out.println("A "+uranus.atmosphere.carbonDioxideRate+"% de dioxyde de carbone");
        System.out.println("A "+uranus.atmosphere.heliumRate+"% d'hélium");
        System.out.println("A "+uranus.atmosphere.methaneRate+"% de méthane");
        System.out.println("A "+uranus.atmosphere.sodiumRate+"% de sodium");

        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));

        System.out.println("Le nombre de planete decouverte actuellement est : " + Planete.nbPlanetsDiscovered);


    }
}
