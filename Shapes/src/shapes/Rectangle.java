/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 * Rectangle Class
 * @author trpot5670
 */

public class Rectangle {
    private float length;
    private float width;
    
    /**
     * constructor
     * pre: none
     * post: A rectangle object is created. Length and width defaulted to 1.
     */
    public Rectangle(){
        length = 1;
        width = 1;
    }
    public Rectangle(float l, float w){
        length = l;
        width = w;
    }
    public Rectangle(float l){
        length = l;
        width = l;
    }
    
    /**
     * Change the length of the rectangle
     * pre: none
     * post: the length of the rectangle is changed
     */
    public void setLength(float l){
        length = l;
    }
    
    /**
     * Change the width of the rectangle
     * pre: none
     * post: the width of the rectangle is changed
     */
    public void setWidth(float w){
        width = w;
    }
    
    /**
     * Calculate the area of the rectangle
     * pre: none
     * post: The area of the rectangle is calculated and returned
     */
    public float area(){
        float rectangleArea = length * width;
        return(rectangleArea);
    }
}
