package Practics.Practice05.num_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RealVsMilan extends JFrame{
    private JButton buttonReal = new JButton("Real Madrid");
    private JButton buttonMilan = new JButton("AC Milan");
    private JLabel labelRes = new JLabel("", JLabel.CENTER);
    private JLabel labelLast = new JLabel("");
    private JLabel labelWinner = new JLabel("");
    private JPanel panel = new JPanel();

    public RealVsMilan(){
        Button res = new Button();
        buttonMilan.setBackground(Color.RED);
        buttonMilan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                res.ScoreMilan();
                labelRes.setText("Result: " + res.getMilanGoals() + " X " + res.getRealGoals());
                labelLast.setText("Last scorer: " + res.getLast());
                labelWinner.setText("Winner: " + res.getWinner());
            }
        });
        buttonReal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                res.ScoreReal();
                labelRes.setText("Result: " + res.getMilanGoals() + " X " + res.getRealGoals());
                labelLast.setText("Last scorer: " + res.getLast());
                labelWinner.setText("Winner: " + res.getWinner());
            }
        });
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));
        container.add(buttonMilan);
        container.add(buttonReal);
        container.add(labelLast);
        container.add(labelWinner);
        container.add(labelRes);
        panel.add(container);

    }
    public static void main(String[] args) {
        RealVsMilan frame = new RealVsMilan();
        frame.setContentPane(frame.panel);
        frame.setTitle("AC Milan VS Real Madrid");
        frame.setSize(450, 240);
        frame.setLocation(550, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
