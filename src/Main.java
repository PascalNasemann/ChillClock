import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setBackground(Color.BLACK);


        window.setBounds(30, 30, 1200, 600);

        // setting canvas for draw
        window.getContentPane().add(new MyCanvas());

        window.setVisible(true);
    }

}
