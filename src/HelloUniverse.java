public class HelloUniverse {
    public static void main(String[] args){
        Planete mercure = new Planete();

        mercure.name = "Mercure";
        mercure.diameter = 4880;
        mercure.matter = "Tellurique";

        Planete venus = new Planete();
        venus.name = "Venus";
        venus.diameter = 12100;
        venus.matter = "Tellurique";

        Planete terre = new Planete();
        terre.name = "Terre";
        terre.diameter = 12756;
        terre.matter = "Tellurique";

        Planete mars = new Planete();
        mars.name = "Mars";
        mars.diameter = 6792;
        mars.matter = "Tellurique";

        Planete jupiter = new Planete();
        jupiter.name = "Jupiter";
        jupiter.diameter = 142984;
        jupiter.matter = "Gazeuse";

        Planete saturne = new Planete();
        saturne.name = "Saturne";
        saturne.diameter = 120536;
        saturne.matter = "Gazeuse";

        Planete uranus = new Planete();
        uranus.name = "Uranus";
        uranus.diameter = 51118;
        uranus.matter = "Gazeuse";

        Planete neptune = new Planete();
        neptune.name = "Neptune";
        neptune.diameter = 49532;
        neptune.matter = "Gazeuse";

        System.out.println(jupiter.name + " est une planète " + jupiter.matter + " avec un diamètre de " + jupiter.diameter + " kilomètres.");
    }
}
