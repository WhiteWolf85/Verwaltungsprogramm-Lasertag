/**
 * Created by Tobi on 17.05.2016.
 */
public interface SpielerInterface {


     void insertScore(int dH, int rH);
     long getScore();
     double getRatio();
     int getGames();
     String getRole();
     String getStatus();
     void setStatus(String status);
     void setRole(String role);
}