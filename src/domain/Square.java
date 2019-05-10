/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.awt.Image;


public class Square {
    
    private Image imagen;
    public String identification;
    private Point pointPosition;
    private int size;
    

    public Square(String identification, int x, int y, int side) {
        
        this.identification = identification;
        pointPosition = new Point(x, y);
        this.size = side;
    }

    public Square(String identification, Point pointPosition, int side) {
        
        this.identification = identification;
        this.pointPosition = pointPosition;
        this.size = side;
    }


    /**
     * @return the pointPosition
     */
    public Point getPointPosition() {
        return pointPosition;
    }

    /**
     * @param pointPosition the pointPosition to set
     */
    public void setPointPosition(Point pointPosition) {
        this.pointPosition = pointPosition;
    }

    /**
     * @return the side
     */
    public int getSide() {
        return size;
    }

    /**
     * @param side the side to set
     */
    public void setSide(int side) {
        this.size = side;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
    
    
}
