import java.util.ArrayList;

/**
 * Created by franz on 16.05.16.
 */
public class Rangliste implements RanglisteInterface {

    @Override
    public ArrayList<? extends Sortable> getSortedList(ArrayList<Sortable> list){
        return this.getSortedList(list,true);
    }

    @Override
    public ArrayList<? extends Sortable> getSortedList(ArrayList<Sortable> list, boolean way){

        boolean sort=true;
        Sortable puffer;

        while(sort) {
            sort=false;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).getScore() < list.get(i + 1).getScore()) {
                        puffer = list.get(i);
                        list.set(i,list.get(i + 1));
                        list.set(i + 1,puffer);
                        sort = true;
                }
            }
        }

        if(way){
            return list;
        }else{
            return this.reverseList(list);
        }

    }

    private ArrayList<Sortable> reverseList(ArrayList<Sortable> list){
        ArrayList<Sortable> reverseList=new ArrayList<Sortable>();
        for(int i=list.size()-1;i>=0;i--){
            reverseList.add(list.get(i));
        }
        return reverseList;
    }


    /*
    @Override
    public ArrayList<Spieler> getList(Team team){
        return getList(team,0);
    }

    @Override
    public ArrayList<Spieler> getList(Team team, int way) {

        Spieler puffer;
        ArrayList<Spieler> spieler=team.spieler;
        while(sort) {
            sort=false;
            for (int i = 0; i < spieler.size()-1; i++) {
                if(way==0) { //von groß nach klein
                    if (spieler.get(i).getScore() < spieler.get(i + 1).getScore()) {
                        puffer = spieler.get(i);
                        spieler.set(i,spieler.get(i + 1));
                        spieler.set(i + 1,puffer);
                        sort = true;
                    }
                }else{ //von klein nach groß
                    if (spieler.get(i).getScore() > spieler.get(i + 1).getScore()) {
                        puffer = spieler.get(i);
                        spieler.set(i,spieler.get(i + 1));
                        spieler.set(i + 1,puffer);
                        sort = true;
                    }
                }
            }
        }

        return spieler;
    }

    @Override
    public ArrayList<Team> getList(ArrayList<Team> teams){
        return getList(teams,0);
    }

    @Override
    public ArrayList<Team> getList(ArrayList<Team> teams, int way){
        boolean sort=true;
        Team puffer;
        while(sort) {
            sort=false;
            for (int i = 0; i < teams.size()-1; i++) {
                if(way==0) { //von groß nach klein
                    if (teams.get(i).getTeamScore() < teams.get(i + 1).getTeamScore()) {
                        puffer = teams.get(i);
                        teams.set(i,teams.get(i + 1));
                        teams.set(i + 1,puffer);
                        sort = true;
                    }
                }else{ //von klein nach groß
                    if (teams.get(i).getTeamScore() > teams.get(i + 1).getTeamScore()) {
                        puffer = teams.get(i);
                        teams.set(i,teams.get(i + 1));
                        teams.set(i + 1,puffer);
                        sort = true;
                    }
                }
            }
        }

        return teams;
    }

    @Override
    public ArrayList<Spieler> getAllPlayers(ArrayList<Team> teams){
        return getAllPlayers(teams,0);
    }

    @Override
    public ArrayList<Spieler> getAllPlayers(ArrayList<Team> teams,int way){
        for(int i=0;i<teams.size();i++){
            for(int a=0;a<teams.get(i).spieler.length;a++) {
                this.scores.set(i,teams.get(i).spieler[a].getScore());
            }
        }
        if(way==0){
            Collections.sort(scores);
        }else{
            //Arrays.sort(this.scores, Collections.reverseOrder());
        }

        for(int i=0;i<teams.size();i++){
            for(int a=0;a<this.scores.size();i++) {
                if (this.scores.get(a).equals(teams.get(i).getTeamScore())) {
                    this.teamList.set(i,teams.get(i));
                }
            }
        }
        return this.playerList;
    }
*/

}
