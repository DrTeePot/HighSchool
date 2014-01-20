/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 * Circle Class
 */
public class Circle {
    private static final float PI = (float) 3.14;
    private float radius;
    
    /**
     * constructor
     * pre: none
     * post: A Circle object is created. Radius initialized to 1.
     */
    public Circle(){
        radius = 1;
    }
    /**
     * constructor
     * pre: none
     * post: A Circle object created with radius r.
     * @param r
     */
    public Circle(float r){
        radius = r;
    }
    
    /**
     * Change the radius of the circle.
     * pre: none
     * post: Radius has been changed
     * @param newRadius
     */
    public void setRadius(float newRadius){
        radius = newRadius;
    }
    
    /**
     * Calculates the area of the circle. 
     * pre: none 
     * post: The area of the circle has been returned.
     * @return circleArea
     */
    public float area(){
        float circleArea;
        
        circleArea = PI * radius * radius;
        return(circleArea);
    }
    
    /**
     * Returns the radius of the circle.
     * pre: none
     * post: The radius of the circle has been returned
     * @return radius
     */
    public double getRadius() {
        return(radius);
    }
    
    public float circumference(){
        return(2 * PI * radius);
    }
    
    public static String areaFormula(){
        return("The formula for the area of a cirlce is PI(r)^2");
    }
    @Override
    public String toString(){
        return("A circle of radius " + radius);
    }
}
