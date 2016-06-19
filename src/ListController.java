import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

/**
 * Created by franz on 19.06.16.
 */
public class ListController {

    @FXML
    private TableView listTeam;
    @FXML
    private TableColumn<Team,String> teamname;
    @FXML
    private TableColumn<Team,String>teamscore;

    //Testwerte für Rangliste


    private Team beamforce = new Team();
    private Team btb = new Team();
    private Spieler whiteWolf = new Spieler();
    private Spieler bloodyMary = new Spieler();
    private Spieler reitermaniac=new Spieler();
    private Spieler pg = new Spieler();
    private Spieler tine = new Spieler();
    private Rangliste sort=new Rangliste();

    private void setValues()
    {



        beamforce.setTeamName("Beamforce ONE");
        btb.setTeamName("BTB");

        whiteWolf.age = 30;
        whiteWolf.name = "Franz";
        whiteWolf.status = "aktiv";
        whiteWolf.nickName = "White Wolf";
        whiteWolf.setRole("Mittelfeld");
        whiteWolf.score = 9001;               //over 9000 ;-)

        bloodyMary.age = 20;
        bloodyMary.name = "Anna";
        bloodyMary.status = "aktiv";
        bloodyMary.nickName = "Bloody Mary";
        bloodyMary.setRole("Runner");
        bloodyMary.score = 689;

        reitermaniac.age = 20;
        reitermaniac.name = "Tom";
        reitermaniac.status = "aktiv";
        reitermaniac.nickName = "Reitermaniac";
        reitermaniac.setRole("Runner");
        reitermaniac.score = 800;

        pg.age = 23;
        pg.name = "PG";
        pg.status = "aktiv";
        pg.nickName = "PG";
        pg.setRole("Runner");
        pg.score = -30;

        tine.age = 21;
        tine.name = "Tine";
        tine.status = "verletzt";
        tine.nickName = "Tine";
        tine.setRole("Mittelfeld");
        tine.score = 50;

        Players play=new Players();
        play.addPlayer(bloodyMary);
        play.addPlayer(whiteWolf);

    }
    //Ende Testwerte

    public void fillList(){
        setValues();
        ArrayList<Sortable> list1=new ArrayList<Sortable>();
        list1.add(beamforce);
        list1.add(btb);
        Rangliste sort=new Rangliste();

        ArrayList<Team> sortedTeam=(ArrayList<Team>)sort.getSortedList(list1);
        ObservableList<Team> ol= FXCollections.observableArrayList(sortedTeam);

        teamname.setCellValueFactory(new PropertyValueFactory<Team,String>("teamName"));
        teamscore.setCellValueFactory(new PropertyValueFactory<Team,String>("teamScore"));

        listTeam.setItems(ol);


        Team test=new Team();
        test.testSpecialClass();
    }

}
