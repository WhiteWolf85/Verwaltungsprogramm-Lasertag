/**
 * Created by Tobi on 12.05.2016.
 */
public class Spieler implements SpielerInterface {

        private String name;
        private int age;
        private String nickName;
        private String team;
        private int gameCounter = 0;
        private String role;
        private String status;
        private long score;
        private int dealtHits;
        private int receivedHits;
        private double ratio;


    //Constructor
    public Spieler(String name, int age, String nickName, String team, String role, String status){
        this.name = name;
        this.age = age;
        this.nickName = nickName;
        this.team = team;
        this.role = role;
        this.status = status;
    }

    public void insertScore(int dH, int rH){    //dealt and received hits of lastest game
        score = dH * 5 - rH * 3;
        this.dealtHits = dealtHits + dH;        //dealtHits are Hits overall, not just one game
        this.receivedHits = receivedHits + rH;  //same for receivedHits
        ratio = (double) this.dealtHits / this.receivedHits;  //calculates new ratio
        gameCounter ++;
    }

    public long getScore(){return score;}
    public double getRatio(){return ratio;}
    public int getGames() {return gameCounter;}
    public String getRole() {return role;}
    public String getStatus(){return status;}
    public void setStatus(String status){this.status = status;}
    public void setRole(String role){this.role = role;}

}
