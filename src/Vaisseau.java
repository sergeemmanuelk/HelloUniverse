public class Vaisseau {

    String type;
    int nbPeople;
    int shielding;
    int shieldResistance;

    void enableShield(){
        System.out.println("Activation du bouclier d'un vaisseau de type "+ type);
    }
    void disableShield(){
        System.out.println("Désactivation du bouclier d'un vaisseau de type "+ type);
    }
}
