/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screensavertimer;

/**
 * Ex 13.19
 * 
 * Iman Fahmy
 * 11/20/17
 */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;

public class Saver extends JPanel implements ActionListener
{
   // random-number generator
   private static final Random random = new Random();
   private Timer timer;

   // constructor sets window's title bar string and dimensions
   public Saver()
   {
      timer = new Timer( 1000, this ); // create the timer, every 1000 milliseconds, the timer triggers an event on the panel
      timer.start();
   } // end SaverJPanel constructor

   // draw lines 
   @Override
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      int x, y, x1, y1;

      for (int i = 0; i < 100; i++)
      {
       x = random.nextInt(301);
       y = random.nextInt(301);
       x1 = random.nextInt(301);
       y1 = random.nextInt(301);
       
       g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
       g.drawLine(x, y, x1, y1);
      }
     //TO DO:
	 //Use for loop to draw 100 lines
		//select x, y, x1, y1 coordinates to be random numbers between 0 and 300
		//set color to be random RGB value
		//call graphics draw line between point (x,y) and point(x1, y1)

   } // end method paintComponent

   // repaint JPanel
   public void actionPerformed( ActionEvent actionEvent )
   {
      repaint();
   } // end method actionPerformed
} // end class SaverJPanel
