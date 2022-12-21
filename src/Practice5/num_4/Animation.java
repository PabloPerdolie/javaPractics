package Practice5.num_4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Animation extends JFrame {
    Image[] frames = {
            Toolkit.getDefaultToolkit().getImage("C:/Users/Пашок/OneDrive/Рабочий стол/1.png"),
            Toolkit.getDefaultToolkit().getImage("C:/Users/Пашок/OneDrive/Рабочий стол/2.png"),
            Toolkit.getDefaultToolkit().getImage("C:/Users/Пашок/OneDrive/Рабочий стол/3.png")
    };
    Animation() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                JPanel gui = new JPanel(new BorderLayout());
                JLabel animation = new JLabel(new ImageIcon(frames[0]));
                gui.add(animation, BorderLayout.CENTER);

                ActionListener animate = new ActionListener() {
                    private int index = 0;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (index < frames.length - 1) {
                            index++;
                        } else {
                            index = 0;
                        }
                        animation.setIcon(new ImageIcon(frames[index]));
                    }
                };

                Timer timer = new Timer(150, animate);

                JToggleButton b = new JToggleButton("Start/Stop");
                b.setSize(200, 100);
                b.setLocation(0, 0);
                ActionListener startStop = new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (b.isSelected()) {
                            timer.start();
                        } else {
                            timer.stop();
                        }
                    }
                };
                b.addActionListener(startStop);
                gui.add(b, BorderLayout.PAGE_END);

                JOptionPane.showMessageDialog(null, gui);
            }
        };
        SwingUtilities.invokeLater(r);
    }

    public static void main(String[] args) {
        Animation app = new Animation();
    }
}
