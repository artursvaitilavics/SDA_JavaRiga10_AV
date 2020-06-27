package ProgrammingGame;

public class Player {
    private String player = "[*]";
    public static int xPos = 0;
    public static int yPos = 0;

//    public Player(){
//        getPlayer();
//    }



    public static int getxPos() {
        return xPos;
    }
    public static void setxPos(int xPos) {
        Player.xPos = xPos;
    }

    public static int getyPos() {
        return yPos;
    }

    public static void setyPos(int yPos) {
        Player.yPos = yPos;
    }


    public String getPlayer(){
        return player;
    }


}
