package gamemap;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Panel extends JPanel{

 Panel(){
  this.setPreferredSize(new Dimension(500,500));
 }
 
 public void paint(Graphics g) {
  
  Graphics2D g2D = (Graphics2D) g;
  
   Image[] image = new Image[5];
   image[0] = null;
   image[1] = null;
   image[2] = null;
   image[3] = null;
   image[4] = null;
   try {                
          image[0] = ImageIO.read(new File("data/1.png"));
          image[1] = ImageIO.read(new File("data/2.png"));
          image[2] = ImageIO.read(new File("data/3.png"));
          image[3] = ImageIO.read(new File("data/4.png"));
          image[4] = ImageIO.read(new File("data/5.png"));
       } catch (IOException ex) {
       }
     int x;
     for (int i = 0; i < 500; i=i+50) {
         for (int j = 0; j < 500; j=j+50) {
             Random random = new Random();
             x = random.nextInt(5);
             g.drawImage(image[x], i, j, this);  
         }
         
     }
   
  

 }
}
