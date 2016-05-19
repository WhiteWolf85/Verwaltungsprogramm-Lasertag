import java.sql.Array;
import java.util.Arrays;

/**
 * Created by franz on 16.05.16.
 */
public class Rangliste implements RanglisteInterface {

    private Spieler playerList[];
    private Team teamList[];
    private long scores[];

    @Override
    public Spieler[] getList(Team team){
        return getList(team,0);
    }

    @Override
    public Spieler[] getList(Team team, int way) {
        //Spieler rangliste[];
        Spieler[] spieler=team.spieler;
        for(int i=0;i<spieler.length;i++){
            this.scores[i]=spieler[i].getScore();
        }
        if(way==0){
            Arrays.sort(this.scores);
        }else{
            //Arrays.sort(this.scores, Collections.reverseOrder());
        }

        for(int i=0;i<spieler.length;i++){
            for(int a=0;a<this.scores.length;i++) {
                if (spieler[i].getScore() == this.scores[a]) {
                    this.playerList[i] = spieler[i];
                }
            }
        }
        return this.playerList;
    }

    @Override
    public Team[] getList(Team[] teams){
        return getList(teams,0);
    }

    @Override
    public Team[] getList(Team[] teams, int way){
        for(int i=0;i<teams.length;i++){
            this.scores[i]=teams[i].getTeamScore();
        }
        if(way==0){
            Arrays.sort(this.scores);
        }else{
            //Arrays.sort(this.scores, Collections.reverseOrder());
        }

        for(int i=0;i<teams.length;i++){
            for(int a=0;a<this.scores.length;i++) {
                if (teams[i].getTeamScore() == this.scores[a]) {
                    this.teamList[i] = teams[i];
                }
            }
        }
        return this.teamList;
    }

    @Override
    public Spieler[] getAllPlayers(Team[] teams){
        return getAllPlayers(teams,0);
    }

    @Override
    public Spieler[] getAllPlayers(Team[] teams,int way){
        for(int i=0;i<teams.length;i++){
            for(int a=0;a<teams[i].spieler.length;a++) {
                this.scores[i] = teams[i].spieler[a].getScore();
            }
        }
        if(way==0){
            Arrays.sort(this.scores);
        }else{
            //Arrays.sort(this.scores, Collections.reverseOrder());
        }

        for(int i=0;i<teams.length;i++){
            for(int a=0;a<this.scores.length;i++) {
                if (teams[i].getTeamScore() == this.scores[a]) {
                    this.teamList[i] = teams[i];
                }
            }
        }
        return this.playerList;
    }

}
