public class Planete {
    String name;
    String matter;
    long diameter;
    int totalVisitors;

    int revolution(int angle){
        return angle/360;
    }

    int rotation(int angle){
        return angle/360;
    }

    void welcomeSpaceship(int numberOfNewHumans){
        totalVisitors += numberOfNewHumans;
    }

    void welcomeSpaceship(String shipType){
        if (shipType.equals("HUNTER")){
            totalVisitors +=3;
        }

        else if (shipType.equals("FRIGATE")){
            totalVisitors +=12;
        }

        if (shipType.equals("CRUISER")){
            totalVisitors +=50;
        }
    }
}
