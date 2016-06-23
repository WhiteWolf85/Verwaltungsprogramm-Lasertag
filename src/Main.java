import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;

public class Main extends Application {

    private static BorderPane root = new BorderPane();

    public static BorderPane getRoot() {
        return root;
    }

    public static ArrayList<Spieler> globalPlayers;
    public static ArrayList<Team> globalTeams;
    public static ArrayList<Vest> globalVests;

    @Override
    public void start(Stage primaryStage) throws Exception{

        setGlobalValues();
        initialValues();

        root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("LaserTag Verwaltungsprogramm");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMaximized(true);
        primaryStage.show();

        URL menuLink = getClass().getResource("menu.fxml");
        Pane menu = FXMLLoader.load( menuLink );

        URL paneOneUrl = getClass().getResource("match.fxml");
        Pane paneOne = FXMLLoader.load( paneOneUrl );

        root.setLeft(menu);
        root.setCenter(paneOne);

    }

    public static void setGlobalValues(){
        globalPlayers=new ArrayList<Spieler>();
        globalTeams=new ArrayList<Team>();
        globalVests=new ArrayList<Vest>();
    }

    public void initialValues(){
        Team t1=new Team("Beamforce ONE");
        Team t2=new Team("BTB");
        Team t3=new Team("Redforce");

        Spieler s1=new Spieler("Anna",25,"BloodyMary","Angriff","aktiv");
        Spieler s2=new Spieler("Franz",30,"WhiteWolf","Mittelfeld","aktiv");
        Spieler s3=new Spieler("Tom",20,"Reitermaniac","Angriff","aktiv");
        Spieler s4=new Spieler("Martin",28,"Unreality","Angriff","aktiv");
        Spieler s5=new Spieler("Werner",35,"Horsti","Mittelfeld","aktiv");
        Spieler s6=new Spieler("Chris",23,"GreyWarden","Verteidigung","aktiv");

        Spieler s7=new Spieler("PG",23,"PG","Angriff","aktiv");
        Spieler s8=new Spieler("Tine",21,"Tine","Mittelfeld","aktiv");
        Spieler s9=new Spieler("Patrick",22,"Nese","Verteidigung","aktiv");
        Spieler s10=new Spieler("Gaby",20,"Gaby","Angriff","aktiv");
        Spieler s11=new Spieler("Lucas",22,"Shadow","Angriff","aktiv");
        Spieler s12=new Spieler("Michael",23,"Kluger","Mittelfeld","aktiv");

        Spieler s13=new Spieler("Andi",40,"Laseropa","Mittelfeld","aktiv");
        Spieler s14=new Spieler("Ali",30,"Ali","Angriff","aktiv");
        Spieler s15=new Spieler("Chris",20,"BlueFlash","Angriff","aktiv");
        Spieler s16=new Spieler("Susi",25,"Schnurzilu","Verteidigung","aktiv");
        Spieler s17=new Spieler("Kassandra",20,"Kässi","Mittelfeld","aktiv");
        Spieler s18=new Spieler("Lisi",22,"Lisi","Mittelfeld","aktiv");

        t1.addToTeam(s1);
        t1.addToTeam(s2);
        t1.addToTeam(s3);
        t1.addToTeam(s4);
        t1.addToTeam(s5);
        t1.addToTeam(s6);

        t2.addToTeam(s7);
        t2.addToTeam(s8);
        t2.addToTeam(s9);
        t2.addToTeam(s10);
        t2.addToTeam(s11);
        t2.addToTeam(s12);

        t3.addToTeam(s13);
        t3.addToTeam(s14);
        t3.addToTeam(s15);
        t3.addToTeam(s16);
        t3.addToTeam(s17);
        t3.addToTeam(s18);

        Vest v1=new Vest();
        Vest v2=new Vest();
        Vest v3=new Vest();
        Vest v4=new Vest();
        Vest v5=new Vest();
        Vest v6=new Vest();
        Vest v7=new Vest();
        Vest v8=new Vest();
        Vest v9=new Vest();
        Vest v10=new Vest();
        Vest v11=new Vest();
        Vest v12=new Vest();


    }

    public static void main(String[] args) {


        launch(args);
    }
}