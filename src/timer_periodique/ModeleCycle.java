package timer_periodique;

import javafx.application.Platform;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.Timer;
import java.util.TimerTask;

public class ModeleCycle {
    private int decalage;
    private int periode;
    private int tempsRouge;
    private int tempsOrange;
    private Circle labelRouge,labelOrange,LabelVert;
    private Timer baseDeTempsV = new Timer();
    private Timer baseDeTempsO = new Timer();
    private Timer baseDeTempsR = new Timer();
    private TimerTask timerTaskV,timerTaskO,timerTaskR;


    public ModeleCycle( int decalage, int periode, int tempsOrange, int tempsRouge, Circle labelRouge, Circle labelOrange, Circle labelVert) {
        this.decalage = decalage;
        this.periode = periode;
        this.tempsRouge = tempsRouge;
        this.tempsOrange = tempsOrange;
        this.labelRouge = labelRouge;
        this.labelOrange = labelOrange;
        this.LabelVert = labelVert;
    }


    public void depart() {
        labelOrange.setFill(Color.BLACK);
        LabelVert.setFill(Color.BLACK);
        labelRouge.setFill(Color.RED);

       //vert
        timerTaskV=new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(()-> {
                    labelOrange.setFill(Color.BLACK);
                    LabelVert.setFill(Color.GREEN);
                    labelRouge.setFill(Color.BLACK);
                });
            }
        };
        baseDeTempsV.scheduleAtFixedRate(timerTaskV,decalage+0,periode);

        //vert
        timerTaskO=new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(()-> {
                    labelOrange.setFill(Color.ORANGE);
                    LabelVert.setFill(Color.BLACK);
                    labelRouge.setFill(Color.BLACK);
                });
            }
        };
        baseDeTempsO.scheduleAtFixedRate(timerTaskO,decalage+3000,periode);

        //vert
        timerTaskR=new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(()-> {
                    labelOrange.setFill(Color.BLACK);
                    LabelVert.setFill(Color.BLACK);
                    labelRouge.setFill(Color.RED);
                });
            }
        };
        baseDeTempsR.scheduleAtFixedRate(timerTaskR,decalage+4000,periode);
    }

}
