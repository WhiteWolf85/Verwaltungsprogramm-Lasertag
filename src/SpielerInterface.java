/**
 * Created by Tobi on 17.05.2016.
 */
public interface SpielerInterface {

     void Spieler(String name, int age, String nickName, Team team, String role, String status);
     void addSpieler();
     void updateScore(int dH, int rH);
     long getScore();
     double getRatio();
     int getGames();
     String getRole();
     String getStatus();
     Spieler getSpieler();
     void setStatus(String status);
     void setRole(String role);
}
