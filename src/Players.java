import java.util.ArrayList;

/**
 * Created by franz on 19.06.16.
 */
public class Players {

    public ArrayList<Spieler> players;

    public void addPlayer(Spieler player){
        players.add(player);
    }
    public void removePlayer(Spieler player){
        players.remove(player);
    }

}
