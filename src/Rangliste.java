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
        boolean sort=true;
        Spieler puffer;
        Spieler[] spieler=team.spieler;
        while(sort) {
            sort=false;
            for (int i = 0; i < spieler.length-1; i++) {
                if(way==0) { //von groß nach klein
                    if (spieler[i].getScore() < spieler[i + 1].getScore()) {
                        puffer = spieler[i];
                        spieler[i] = spieler[i + 1];
                        spieler[i + 1] = puffer;
                        sort = true;
                    }
                }else{ //von klein nach groß
                    if (spieler[i].getScore() > spieler[i + 1].getScore()) {
                        puffer = spieler[i];
                        spieler[i] = spieler[i + 1];
                        spieler[i + 1] = puffer;
                        sort = true;
                    }
                }
            }
        }

        return spieler;
    }

    @Override
    public Team[] getList(Team[] teams){
        return getList(teams,0);
    }

    @Override
    public Team[] getList(Team[] teams, int way){
        boolean sort=true;
        Team puffer;
        while(sort) {
            sort=false;
            for (int i = 0; i < teams.length-1; i++) {
                if(way==0) { //von groß nach klein
                    if (teams[i].getTeamScore() < teams[i + 1].getTeamScore()) {
                        puffer = teams[i];
                        teams[i] = teams[i + 1];
                        teams[i + 1] = puffer;
                        sort = true;
                    }
                }else{ //von klein nach groß
                    if (teams[i].getTeamScore() > teams[i + 1].getTeamScore()) {
                        puffer = teams[i];
                        teams[i] = teams[i + 1];
                        teams[i + 1] = puffer;
                        sort = true;
                    }
                }
            }
        }

        return teams;
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
