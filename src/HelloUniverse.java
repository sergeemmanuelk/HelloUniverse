public class HelloUniverse {
    public static void main(String[] args){
        String sentence = "En %d, les planètes du système solaire etaient au nombre de : %d";
        short year = 2003;
        int nbPlanet = 0;
        if(year < 2006){
            nbPlanet = 9;
        }

        if(year >= 2006){
            nbPlanet = 8;
        }
        System.out.printf(sentence, year, nbPlanet);
    }
}
