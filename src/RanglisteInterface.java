/**
 * Created by franz on 16.05.16.
 */


public interface RanglisteInterface {


    public Spieler[] getList(Team team, int way);
    public Spieler[] getList(Team team);
    public Team[] getList(Team[] teams, int way);
    public Team[] getList(Team[] teams);
    public Spieler[] getAllPlayers(Team[] teams,int way);
    public Spieler[] getAllPlayers(Team[] teams);

}
