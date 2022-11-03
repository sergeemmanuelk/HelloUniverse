public class WarShip extends Vaisseau{

    void offensive(Vaisseau shipAttack, String weaponUsed, int attackDuration) {
        System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + shipAttack.type+ " en utilisant l'arme " + weaponUsed + " pendant " + attackDuration + " minutes.");

        shipAttack.shieldResistance = 0;
        shipAttack.shielding = shipAttack.shielding/2;
    }

}
