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

        Spieler s1=new Spieler("Anna",20,"BloodyMary",t1,"Angriff","aktiv");
        Spieler s2=new Spieler("Franz",30,"WhiteWolf",t1,"Mittelfeld","aktiv");
        Spieler s3=new Spieler("Tom",20,"Reitermaniac",t1,"Angriff","aktiv");

        Spieler s4=new Spieler("PG",23,"PG",t2,"Angriff","aktiv");
        Spieler s5=new Spieler("Tine",21,"Tine",t2,"Mittelfeld","aktiv");
        Spieler s6=new Spieler("Patrick",22,"Nese",t2,"Verteidigung","aktiv");

        Spieler s7=new Spieler("Andi",40,"Laseropa",t3,"Mittelfeld","aktiv");
        Spieler s8=new Spieler("Ali",30,"Ali",t3,"Angriff","aktiv");
        Spieler s9=new Spieler("Chris",20,"BlueFlash",t3,"Angriff","aktiv");

        Vest v1=new Vest();
        Vest v2=new Vest();
        Vest v3=new Vest();
        Vest v4=new Vest();
        Vest v5=new Vest();
        Vest v6=new Vest();


    }

    public static void main(String[] args) {


        launch(args);
    }
}
