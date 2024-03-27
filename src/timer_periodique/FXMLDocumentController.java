/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer_periodique;

import javafx.fxml.Initializable;
import javafx.scene.control.ToggleButton;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author Michael
 */
public class FXMLDocumentController implements Initializable {


    public Circle rougeG1;
    public Circle orangeG1;
    public Circle vertG1;
    public Circle rougeG2;
    public Circle orangeG2;
    public Circle vertG2;
    public Circle rougeP1;
    public Circle orangeP1;
    public Circle vertP1;
    public Circle Circle_1s;
    public Circle Circle_5s;
    public Circle Circle_10s;
    public ToggleButton c1;
    public ToggleButton c2;
    ModeleCycle cyleF1,cyleF2,cyleF11;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cyleF1=new ModeleCycle(0,9000,1000,4000,rougeG1,orangeG1,vertG1);
        cyleF2=new ModeleCycle(4500,9000,1000,4000,rougeG2,orangeG2,vertG2);
        cyleF11=new ModeleCycle(0,9000,1000,4000,rougeP1,orangeP1,vertP1);

        new Thread(()->{
            cyleF1.depart();
        }).start();

        new Thread(()->{
            cyleF2.depart();
        }).start();

        new Thread(()->{
            cyleF11.depart();
        }).start();




    }

}


