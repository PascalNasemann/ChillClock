import java.awt.*;

public class DrawOne7Segement {

    public DrawOne7Segement(Graphics g, int x_start, int y_start, boolean[] zeichen){
        //Punkt eins
        OneSegment segment_1 = new OneSegment(g, x_start, y_start, true, zeichen[0]);
        OneSegment segment_2 = new OneSegment(g, x_start, y_start, false, zeichen[1]);

        //Punkt 2
        OneSegment segment_3 = new OneSegment(g, x_start +180, y_start, true, zeichen[2]);

        //Punkt 3
        OneSegment segment_4 = new OneSegment(g, x_start, y_start +180, false, zeichen[3]);
        OneSegment segment_5 = new OneSegment(g, x_start, y_start +180, true, zeichen[4]);

        //Punkt 4
        OneSegment segment_6 = new OneSegment(g, x_start, y_start+360, false, zeichen[5]);

        //Punkt 5
        OneSegment segment_7 = new OneSegment(g, x_start+180, y_start+180, true, zeichen[6]);

    }
}
