public class ArcadeGame {
    String gameName;
    int numberOfTokens;
    boolean isMultiplayer;

    public ArcadeGame(String paramName, int paramNumber, boolean paramMultiplayer){
        gameName = paramName;
        numberOfTokens = paramNumber;
        isMultiplayer = paramMultiplayer;
    }

    public void printInfo(){
        System.out.println("The game name is " + gameName + " it costs " + numberOfTokens + " tokens and it is " + isMultiplayer + " that there is multiplayer");
    }
}
