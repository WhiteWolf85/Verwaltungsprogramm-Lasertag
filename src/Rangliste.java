import java.util.Arrays;

/**
 * Created by franz on 16.05.16.
 */
public class Rangliste implements RanglisteInterface {

    private Rangliste rangliste[];
    private long scores[];

    @Override
    public void addPlayer(Spieler player) {

    }

    @Override
    public void addTeam(Team team) {

    }

    @Override
    public Rangliste sortList(int way) {
        return null;
    }

    @Override
    public Rangliste getListing(int way) {
        return null;
    }

    @Override
    public Rangliste[] RANGLISTE(Team team, int way) {
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
            for(int a=0;a<scores.length;i++) {
                if (spieler[i].getScore() == scores[a]) {
                    rangliste[i] = spieler[i];
                }
            }
        }


        return rangliste;
    }
}
