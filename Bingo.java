import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.BorderLayout;

import javax.swing.BorderFactory;

public class Bingo{
    public Bingo(){
        /*
        I know this isnt an elegant way to do this yet.

        TODO 
        Urgent: Add buttons to an Array you lazy lad

        Normal: Add Functionality

        Low: Figure out swing vs awt i guess?
        */
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(3,3, 5, 5));
        panel.add(new Button("1"));
        panel.add(new Button("2"));
        panel.add(new Button("3"));
        panel.add(new Button("4"));
        panel.add(new Button("5"));
        panel.add(new Button("6"));
        panel.add(new Button("7"));
        panel.add(new Button("8"));
        panel.add(new Button("9"));
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("League of Legends Bingo");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new Bingo();
        System.out.print("Howdy");
    }
}
