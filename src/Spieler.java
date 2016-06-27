

/**
 * Created by Tobi on 12.05.2016.
 */
public class Spieler implements SpielerInterface, Sortable{

        private String name;
        private int age;
        private String nickName;
        private String role;
        private String status;
        private int score;
        private Team team;
        private float ratio;
        private Spieler spieler;

    //Constructor
    public Spieler(String name, int age, String nickName, String role, String status){
        this.name = name;
        this.age = age;
        this.nickName = nickName;
        this.role = role;
        this.status = status;
        Main.globalPlayers.add(this);
    }

    public void updateScore(int sc){
        score += sc;
    }

    public int getScore(){return score;}
    public float getRatio(){return ratio;}
    public String getRole() {return role;}
    public String getStatus(){return status;}
    public Spieler getSpieler(){return this.spieler;}
    public void setStatus(String status){this.status = status;}
    public void setRole(String role){this.role = role;}
    public String getNickName(){return nickName;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public Team getTeam(){return team;}
    public void setTeam(Team team){this.team = team;}

}
