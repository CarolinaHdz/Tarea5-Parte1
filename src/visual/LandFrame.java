/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visual;

import domain.Square;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import utility.Variables;


public class LandFrame extends JFrame{
    
    //variables
    public ArrayList<Square> mySquares;
    BufferedImage bufferImage1;

    //constructor
    public LandFrame(ArrayList<Square> mySquares) {
        super("SNAIL COMPETITION");
        try {
            this.mySquares = mySquares;
            this.setSize(Variables.WIDTH, Variables.HEIGHT);
            this.setVisible(true);
            
            ((JPanel)getContentPane()).setOpaque(false);
            ImageIcon uno = new ImageIcon(this.getClass().getResource("/assets/cesped.jpg"));
            JLabel fondo = new JLabel();
            fondo.setIcon(uno);
            getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
            fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
            
            bufferImage1 = ImageIO.read(getClass().getResourceAsStream("/assets/caracol.png"));
        } catch (IOException ex) {
            Logger.getLogger(LandFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        //iterate over all squares
        for (Square mySquare : mySquares) {
            g.drawString(mySquare.getIdentification(),mySquare.getPointPosition().getX(),mySquare.getPointPosition().getY()-5);
            //g.fillRect(mySquare.getPointPosition().getX(), mySquare.getPointPosition().getY(), mySquare.getSide(), mySquare.getSide());
            g.drawImage(bufferImage1,mySquare.getPointPosition().getX(), mySquare.getPointPosition().getY(),null);
        } //end for
    }

    public void paintAgain(){
        repaint();
    }

}
