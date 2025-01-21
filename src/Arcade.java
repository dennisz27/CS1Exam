import java.sql.SQLOutput;

public class Arcade {

    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        Arcade pixelParadise = new Arcade();
    }

    public Arcade() {
        name = "Pixel Paradise";
        isOpen = true;
        yearFounded = 1985;
        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. We were founded in " + yearFounded);
        yearFounded = 2009;
        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. We were founded in " + yearFounded);

        spinForTokens();
        gameOfTheDay("Pac-Man");
        displayScores();
        ticketMultiplier();

        ArcadeGame classicGame = new ArcadeGame("Pinball", 2, false);
        classicGame.printInfo();

        ArcadeGame myFavGame = new ArcadeGame("Pac-Man", 5, true);
        myFavGame.printInfo();
    }
    public void spinForTokens(){
        int randomInt = (int)(Math.random()*50+1);
        System.out.println("You spin the wheel and you won " +randomInt + " token!");
    }
    public void gameOfTheDay(String gameName){
        System.out.println("Today's game of the day is " + gameName);
    }

    public void displayScores(){
        for(int x=1; x<6; x++){
            System.out.println(x);
        }
        for(int x=200; x<1101; x = x+300){
            System.out.println(x);
        }
        for(int x=6; x>-1; x--) {
            System.out.println(x);
        }
    }

    public void ticketMultiplier(){
        double randomNum = Math.random();

        if (randomNum < 0.25){
            System.out.println("You've won 10 extra tickets");
        } else if (randomNum >= 0.25 && randomNum < 0.5){
            System.out.println("You've won 50 extra tickets");
        } else if (randomNum >= 0.5 && randomNum < 0.75){
            System.out.println("You've doubled your tickets");
        } else {
            System.out.println("You've tripled your tickets");
        }
    }
}
