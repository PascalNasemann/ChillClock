import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class MyCanvas extends JComponent {

    private static int sizeonesekment = 180;

    private static boolean[] _Leer = {true,true,false,false,true,true,false};

    private static boolean[] _C = {true,true,false,false,true,true,false};
    private static boolean[] _H = {true,false,true,true,true,false,true};
    private static boolean[] _L = {true,false,false,false,true,true,false};

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        int x = 30;
        int y = 50;
        int witdhonesevensegment =220;
        DrawOne7Segement firstsegment   = new DrawOne7Segement(g, x,  y, _C); x+= witdhonesevensegment+30;
        DrawOne7Segement secondsegment  = new DrawOne7Segement(g, x, y, _H); x+= witdhonesevensegment+150;

        g2d.fill(new Ellipse2D.Double(520,100,60,60));
        g2d.fill(new Ellipse2D.Double(520,260,60,60));

        DrawOne7Segement thirdsegment   = new DrawOne7Segement(g, x, y, _L); x+= witdhonesevensegment+30;
        DrawOne7Segement fourthsegment  = new DrawOne7Segement(g, x, y, _L);
    }



}
