//GUI Menu for users to interact with program


import javax.swing.*;
import java.awt.*;

public class Menu{
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Menu GUI");
        JButton button1 = new JButton("Create Database");
        JButton button2 = new JButton("Enter Data");
        JButton button3 = new JButton("Display Data");

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);


        frame.add(Box.createRigidArea(new Dimension(10, 10)));
        frame.add(button1);
        frame.add(Box.createRigidArea(new Dimension(10, 10)));
        frame.add(button2);
        frame.add(Box.createRigidArea(new Dimension(10, 10)));
        frame.add(button3);
        frame.getRootPane().setDefaultButton(button1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}