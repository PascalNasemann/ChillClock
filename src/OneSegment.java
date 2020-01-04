import java.awt.*;
import java.awt.geom.GeneralPath;

public class OneSegment {

    private int sizeonesekment = 180;

    public OneSegment(Graphics g, int x_start, int y_start, boolean horizontal, boolean filled) {
        if(horizontal){
            paintonesekmenthorizontal(g, x_start, y_start, filled);
        }
        else {
            paintonesekmentvertikal(g, x_start, y_start,filled);
        }

    }


        private void paintonesekmentvertikal(Graphics g, int x_start, int y_start, boolean filled){
            Graphics2D g2d = (Graphics2D) g;
            GeneralPath path = new GeneralPath();
            path.moveTo(x_start, y_start);

            int new_x = x_start+40;

            g.setColor(Color.BLACK);
            g.drawLine(x_start,y_start,new_x, y_start+20);
            g.drawLine(x_start,y_start,new_x,y_start-20);


            g.drawLine(new_x, y_start+20, new_x + 100, y_start+20);
            g.drawLine(new_x, y_start-20, new_x + 100, y_start-20);

            new_x+=100;
            g.drawLine(new_x,y_start+20,new_x+40, y_start);
            g.drawLine(new_x,y_start-20,new_x+40, y_start);


            if(filled){
                path.lineTo(x_start+40, y_start+20);
                path.lineTo(x_start+140, y_start+20);
                path.lineTo(x_start+180, y_start);
                path.lineTo(x_start+140, y_start-20);
                path.lineTo(x_start+40, y_start-20);
                path.lineTo(x_start,y_start);

                path.closePath();
                g2d.setPaint(Color.RED);
                g2d.fill(path);
            }

        }

        private void paintonesekmenthorizontal(Graphics g, int x_start, int y_start, boolean filled){
            Graphics2D g2d = (Graphics2D) g;
            GeneralPath path = new GeneralPath();
            path.moveTo(x_start, y_start);

            int new_y = y_start+40;

            g.setColor(Color.BLACK);
            g.drawLine(x_start,y_start,x_start+20, new_y);
            g.drawLine(x_start,y_start,x_start-20,new_y);


            g.drawLine(x_start+20, new_y, x_start+20, new_y+100);
            g.drawLine(x_start-20, new_y, x_start-20, new_y+100);

            new_y+=100;
            g.drawLine(x_start+20,new_y,x_start, new_y+40);
            g.drawLine(x_start-20,new_y, x_start, new_y+40);

            if (filled) {
                path.lineTo(x_start + 20, y_start + 40);
                path.lineTo(x_start + 20, y_start + 140);
                path.lineTo(x_start, y_start + 180);
                path.lineTo(x_start + -20, y_start + 140);
                path.lineTo(x_start - 20, y_start + 40);
                path.lineTo(x_start, y_start);

                path.closePath();
                g2d.setPaint(Color.red);
                g2d.fill(path);
            }

        }

}
