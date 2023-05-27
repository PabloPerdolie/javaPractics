package practicsSem1.Practice05.num_3;

import javax.swing.*;
import java.awt.*;

class Picture extends JFrame {
    String path = "C:/Users/Пашок/OneDrive/Рабочий стол/самокат.png";
    int width = 850, height = 500;

    Picture() {
        super("Picture");
        setSize(width, height);
        setLayout(null);
        setLocation(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Picture app = new Picture();
    }

    public void paint(Graphics g) {
        Image img = Toolkit.getDefaultToolkit().getImage(path);
        g.drawImage(img, 0, 0, width, height, this);
    }
}