/**
 * Created by Tobi on 12.05.2016.
 */
public class Spieler implements SpielerInterface {

        public String name;
        public int age;
        public String nickName;
        public String team;
        public int gameCounter = 0;
        public String role;
        public String status;
        public long score;
        public int Hits;
        public int HitsBy;
        public double ratio;


    //Constructor
    public Spieler(String name, int age, String nickName, String team, String role, String status){
        this.name = name;
        this.age = age;
        this.nickName = nickName;
        this.team = team;
        this.role = role;
        this.status = status;
    }

    public void insertScore(int H, int HB){    //Hits, HitsBy
        score = H * 5 - HB * 3;
        this.Hits = Hits + H;        //dealtHits are Hits overall, not just one game
        this.HitsBy = HitsBy + HB;  //same for receivedHits
        ratio = (double) this.Hits / this.HitsBy;  //calculates new ratio
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
