public class StaticPlayer {
    String name;
    int id;
    private static int playerCount = 0;

    StaticPlayer(String name){
        this.name = name;
        id = playerCount++;
    }
    static int getCount(){
        return playerCount;
    }

    public static void main(String[] args) {
        // Static members can be accessed without creating an object
        // Static methods cannot access non-static members
        // Non-static methods can access static members
        // Static methods do not have access to this reference
        StaticPlayer p1 = new StaticPlayer("Pavan");
        StaticPlayer p2 = new StaticPlayer("Sai");

        System.out.println(StaticPlayer.getCount());
    }
}
