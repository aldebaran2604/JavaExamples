package Swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.net.http.WebSocket.Listener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class FlashCardBuilder {

    private JTextArea question;
    private JTextArea answer;
    private ArrayList<FlashCard> cardList;
    private JFrame frame;

    public FlashCardBuilder() {
        frame = new JFrame("Flash Card");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel to hold everything
        JPanel mainPanel = new JPanel();

        // create font
        Font greatFont = new Font("Helvetica Neue", Font.BOLD, 21);

        // Create JTestArea
        question = new JTextArea(6, 20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(greatFont);

        // Question area
        JScrollPane qJScrollPane = new JScrollPane(question);
        qJScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qJScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        // Answer Area

        answer = new JTextArea(6, 20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(greatFont);

        // JScrollPanel
        JScrollPane aJScrollPanel = new JScrollPane(answer);
        aJScrollPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aJScrollPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        // Create JButton
        JButton nextButton = new JButton("Next Card");
        nextButton.addActionListener(new NextCardListener());

        // Create few JLabels
        JLabel qJLabel = new JLabel("Question");
        JLabel aJLabel = new JLabel("Answer");

        // Add componentes to mainPanel
        mainPanel.add(qJLabel);
        mainPanel.add(qJScrollPane);
        mainPanel.add(aJLabel);
        mainPanel.add(aJScrollPanel);
        mainPanel.add(nextButton);
        
        // Add to the frame
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500, 600);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlashCardBuilder();
            }
        });
    }

    class NextCardListener implements ActionListener {
        @Override
        public void actionPerformend(ActionEvent e) {

        }
    }
}
