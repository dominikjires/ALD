package gamemap;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Panel extends JPanel {

    Panel() {
        this.setPreferredSize(new Dimension(1000, 1000));
    }

    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        Image[] image = new Image[7];
        image[0] = null;
        image[1] = null;
        image[2] = null;
        image[3] = null;
        image[4] = null;
        image[5] = null;
        image[6] = null;
        try {
            image[0] = ImageIO.read(new File("data/1.png"));
            image[1] = ImageIO.read(new File("data/2.png"));
            image[2] = ImageIO.read(new File("data/3.png"));
            image[3] = ImageIO.read(new File("data/4.png"));
            image[4] = ImageIO.read(new File("data/5.png"));
            image[5] = ImageIO.read(new File("data/6.png"));
            image[6] = ImageIO.read(new File("data/7.png"));
        } catch (IOException ex) {
        }
        int x;

        int[][] squares = {{0, 1, 0, 1}, {0, 1, 1, 1}, {1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 0},{0, 1, 1, 0}, {1, 1, 0, 0}};
        int[][] map = new int[20][20];

        Random random = new Random();

        int y;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (i == 0 && j == 0) {
                    y = random.nextInt(7);
                    map[i][j] = y;
                } else if (i == 0) {
                    do {
                        y = random.nextInt(7);
                        map[i][j] = y;
                    } while (squares[map[i][j - 1]][1] != squares[map[i][j]][3]);
                } else if (j == 0) {
                    do {
                        y = random.nextInt(7);
                        map[i][j] = y;
                    } while (squares[map[i - 1][j]][2] != squares[map[i][j]][0]);
                } else {
                    do {
                        y = random.nextInt(7);
                        map[i][j] = y;
                    } while (squares[map[i - 1][j]][2] != squares[map[i][j]][0] || squares[map[i][j - 1]][1] != squares[map[i][j]][3] );
                }
            }

        }
        
        

        int k = 0;
        for (int i = 0; i < 1000; i = i + 50) {
            int l = 0;
            for (int j = 0; j < 1000; j = j + 50) {
                
                g.drawImage(image[map[l][k]], i, j, this);
                l = l + 1;
            }
            k = k + 1;
        }
        
    }
    
    
}


