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
import javax.swing.JFrame;

public class ScreenSaverTimer {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Saver screen = new Saver();
        frame.add(screen);
        frame.setSize(300,300);
        frame.setVisible(true);
        
        
    }
    
}
