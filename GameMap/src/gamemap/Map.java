package gamemap;

import javax.swing.*;

public class Map extends JFrame{
 
 Panel panel;
 
 Map(){
  
  panel = new Panel();
  
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  this.add(panel);
  this.pack();
  this.setLocationRelativeTo(null);
  this.setVisible(true);
 }  
}
