/**
 * Created by Tobi on 17.05.2016.
 */
public interface SpielerInterface {


     void updateScore(int sc);
     int getScore();
     float getRatio();
     String getRole();
     String getStatus();
     Spieler getSpieler();
     void setStatus(String status);
     void setRole(String role);
     String getNickName();
     String getName();
     int getAge();
}
