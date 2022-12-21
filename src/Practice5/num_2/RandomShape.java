package Practice5.num_2;

import javax.swing.*;
import java.awt.*;

class RandomShape extends JFrame {
    RandomShape() {
        super("RandomShapes");
        setSize(600, 600);
        setLocation(300, 100);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Shape s = new Shape();
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * 4);
            switch (x) {

                case 0:
                    g.setColor(new Color(s.getColor()));
                    g.fillOval(s.getX(), s.getY(), (int) (Math.random() * 200), (int) (Math.random() * 200));
                    break;

                case 1:
                    g.setColor(new Color(s.getColor()));
                    g.fillRect(s.getX(), s.getY(), (int) (Math.random() * 200), (int) (Math.random() * 200));
                    break;

                case 2:
                    g.setColor(new Color(s.getColor()));
                    g.fillRoundRect(s.getX(), s.getY(), (int) (Math.random() * 200), (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200));
                    break;

                case 3:
                    g.setColor(new Color(s.getColor()));
                    g.fillOval(s.getX(), s.getY(), 100, 100);
                    break;

                default:
                    break;
            }
        }
    }


    public static void main(String[] args) {
        RandomShape app = new RandomShape();
    }
}
