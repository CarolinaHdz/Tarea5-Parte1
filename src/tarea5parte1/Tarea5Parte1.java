/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5parte1;

import domain.Point;
import domain.Square;
import java.util.ArrayList;
import javax.swing.JFrame;
import threads.RepaintLandThread;
import threads.SquareThread;
import utility.Variables;
import visual.LandFrame;

/**
 *
 * @author Caro
 */
public class Tarea5Parte1 {

    public static void main(String[] args) {
        //create the domain squares
        Square square1 = new Square("Thread Snail #1", new Point(0, 50),100);
        Square square2 = new Square("Thread Snail #2", new Point(0, 200), 100);
        Square square3 = new Square("Thread Snail #3", new Point(0, 350), 100);
        Square square4 = new Square("Thread Snail #4", new Point(0, 500), 100);
        
        //create the array list for the frame to paint
        ArrayList<Square> squareList = new ArrayList<>();
        squareList.add(square1);
        squareList.add(square2);
        squareList.add(square3);
        squareList.add(square4);
        
        //create the new frame and send the square list
        LandFrame myLand = new LandFrame(squareList);
        myLand.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //thread for repainting
        RepaintLandThread repaintThread = new RepaintLandThread(myLand,500);
        repaintThread.start();
        
        //thread for controlling the movement of the squares
        SquareThread squareThread1 = new SquareThread(square1, Variables.HIGH_SPEED);
        SquareThread squareThread2 = new SquareThread(square2, Variables.LOW_SPEED);
        SquareThread squareThread3 = new SquareThread(square3, Variables.MIDDLE_SPEED);
        SquareThread squareThread4 = new SquareThread(square4, Variables.HIGH_SPEED);
        squareThread1.start();
        squareThread2.start();
        squareThread3.start();
        squareThread4.start();
    }//end main
    
}
