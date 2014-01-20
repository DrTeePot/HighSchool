/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author trpot5670
 */
public class Cylinder extends Circle{
    private float thickness;
    /**
     * Constructor
     * pre: none
     * post: Creates a cylinder object with thickness 1 and default radius.
     */
    Cylinder(){
        super();
        thickness = 1;
    }
    /**
     * Constructor 
     * pre: none
     * post: Creates a cylinder object with thickness t and default radius.
     */
    Cylinder(float t){
        super();
        thickness = t;
    }
    /**
     * Constructor
     * pre: none
     * post: Creates a cylinder object with thickness t and radius r.
     * @param t, r
     */
    Cylinder(double t, double r){
        super((float)r);
        thickness = (float)t;
    }
    
    /**
     * Sets the thickness (mutator)
     * pre: none
     * post: Sets the thickness of the cylinder object to t.
     * @param t
     */
    public void setThickness(float t){
        thickness = t;
    }
    
    /**
     * Gets the thickness (accessor)
     * pre: none
     * post: Returns the thickness of the cylinder object
     * @return thickness
     */
    public float getThickness(){
        return(thickness);
    }
    
    /**
     * Gets the volume of the cylinder (accessor)
     * pre: none
     * post: Returns the volume of the cylinder.
     * @return volume
     */
    public float volume(){
        return(area() * thickness); // accesses parents getArea() method : super.getArea();
    }
    
}
