/**
 * Created by franz on 16.05.16.
 */


public interface RanglisteInterface {


    Spieler[] getList(Team team, int way);
    Spieler[] getList(Team team);
    Team[] getList(Team[] teams, int way);
    Team[] getList(Team[] teams);

}
