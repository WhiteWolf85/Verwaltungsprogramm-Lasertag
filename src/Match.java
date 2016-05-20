/**
 * Created by franz on 20.05.16.
 */
public class Match {

    private int playedMatches=0;
    private boolean warning=false;
    private int voidVestID=0;
    private int replacementVestID=0;
    private Vest[] replacementVest;

    void startGame(Vest[] vestCollection){

        if(testVestCharge(vestCollection)) {
            for (int i = 0; i < vestCollection.length; i++) {
                vestCollection[i].setHits(createNumbers());
                vestCollection[i].setHitsby(createNumbers());
            }
            this.playedMatches += 1;
        }
    }

    private boolean testVestCharge(Vest[] vestCollection){
        for(int i=0; i<vestCollection.length;i++){

            if(vestCollection[i].getBatteryCharge()<10.0){
                this.voidVestID=vestCollection[i].getVestNumber();
                warning=true;
                return false;
            }
        }
        return true;
    }

    void setReplacementVest(Vest[] vests){
        this.replacementVest=vests;
    }

    void combinePlayerWithVest(Spieler spieler, Vest vest){
        vest.setPlayer=spieler;
    }

    private int createNumbers(){
        int zufallszahl;
        zufallszahl = (int)(Math.random() * 100);
        return zufallszahl;
    }

    public int checkWarning(){
        if(warning){
            return this.vestID;
        }
        return -1;
    }

}
