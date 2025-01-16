package igraphic.ex12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayout {
    private JPanel mainPanel;
    private JPanel buttonsPanel;
    private JPanel parentPanel;
    private JButton card1Button;
    private JButton card2Button;
    private JButton card3Button;
    private JPanel card1Panel;
    private JPanel card2Panel;
    private JPanel card3Panel;
    private JTextArea textArea1;
    private JTable table1;

    public CardLayout() {
        card1Button.addActionListener(e -> {
            parentPanel.removeAll();
            parentPanel.add(card1Panel);
            parentPanel.repaint();
            parentPanel.revalidate();
        });

        card2Button.addActionListener(e -> {
            parentPanel.removeAll();
            parentPanel.add(card2Panel);
            parentPanel.repaint();
            parentPanel.revalidate();
        });

        card3Button.addActionListener(e -> {
            parentPanel.removeAll();
            parentPanel.add(card3Panel);
            parentPanel.repaint();
            parentPanel.revalidate();
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setContentPane(new CardLayout().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
