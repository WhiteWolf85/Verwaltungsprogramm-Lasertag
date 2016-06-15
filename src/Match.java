/**
 * Created by franz on 20.05.16.
 */
public class Match implements MatchInterface{

    private static int playedMatches;

    public void startGame(Spieler[] spieler, Vest[] vest){
        int hits;
        int hitsBy;

        if(spieler.length<=vest.length) {
            for(int i=0;i<spieler.length;i++) {
                hits=getResult();
                hitsBy=getResult();
                vest[i].setHits(hits);
                vest[i].setHitsby(hits);
                spieler[i].updateScore(hits,hitsBy);
            }
            this.playedMatches += 1;
        }
    }

    private int getResult(){
        int zufallszahl;
            zufallszahl = (int)(Math.random() * 50);
            return zufallszahl;
        }
    }







