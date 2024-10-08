public class Player {
    // Static member in java
    String name;
    int id;
//    static int playerCount = 0;
    private static int playerCount = 0;

    Player(String name){
        this.name = name;
        id = ++playerCount;
    }
//    void printDetails(){
//        System.out.println(id + ": " + name);
//    }

    static  int getPlayerCount(){
        return playerCount;
    }
}
