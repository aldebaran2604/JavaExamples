package Swing;

import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * SwingDemo
 */
public class SwingDemo implements ActionListener {

    JLabel jLabel;
    JTextField jTextField;

    public SwingDemo() {

        // Create a new jframe container
        JFrame jFrame = new JFrame("First Swing Application");

        // Give it a size
        jFrame.setSize(400, 400);

        // Terminate the program when the user closes the application
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make a button
        JButton jButtonUp = new JButton("Up");
        JButton jButtonDown = new JButton("Down");
        JButton jButtonTest = new JButton("Test");
        JButton jButtonReverse = new JButton("Reverse");

        // Add EventListeners
        // jButtonUp.addActionListener(new ActionListener() {
        // @Override
        // public void actionPerformed(ActionEvent e) {
        // jLabel.setText("Hello Up Clicked");

        // }
        // });

        // jButtonDown.addActionListener(new ActionListener() {
        // @Override
        // public void actionPerformed(ActionEvent e) {
        // jLabel.setText("Hello Down Clicked");
        // }
        // });

        // jButtonTest.addActionListener(new ActionListener(){
        // @Override
        // public void actionPerformed(ActionEvent e) {
        // jLabel.setText("Hello Test Clicked");
        // }
        // });

        jButtonUp.addActionListener(this);
        jButtonDown.addActionListener(this);
        jButtonTest.addActionListener(this);
        jButtonReverse.addActionListener(this);

        // Add to the frame
        jFrame.add(jButtonUp);
        jFrame.add(jButtonDown);
        jFrame.add(jButtonTest);
        jFrame.add(jButtonReverse);

        // Create TextField
        jTextField = new JTextField(10);

        jTextField.setActionCommand("textField");

        // Add EventListener
        jTextField.addActionListener(this);

        // Add to the frame
        jFrame.add(jTextField);

        // Create a jlabel
        jLabel = new JLabel("Wow this is amazing!");

        // Add to the frame
        jFrame.add(jLabel);

        // Specific FlowLayout for the manager
        jFrame.setLayout(new FlowLayout());

        // Show it
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Reverse")) {
            String originalString = jTextField.getText();
            String reverseString = "";
            for(int index =  originalString.length() - 1; index >= 0; index --){
                reverseString += originalString.charAt(index);
            }
            jLabel.setText(reverseString);
        } else {

        }
        
    }

    public static void main(String[] args) {
        // Create de from on the event dispatching thread
        SwingUtilities.invokeLater(() -> new SwingDemo());
    }

}