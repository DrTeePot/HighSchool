/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 * RectangularPrism Class
 * @author trpot5670
 */
public class RectangularPrism extends Rectangle{
    private float thickness;
    
    /**
     * constructor
     * pre: none
     * post: Creates a RectangularPrism object with a thickness of 1 and default length and width
     */
    RectangularPrism(){
        thickness = 1;
    }
    /**
     * constructor
     * pre: none
     * post: Creates a RectangularPrism object with a thickness of t
     * @param t
     */
    RectangularPrism(float t){
        thickness = t;
    }
    /**
     * constructor
     * pre: none
     * post: Creates a RectangularPrism object with a thickness of t and a length and width of l.
     * @param l, t
     */
    RectangularPrism(float l, float t){
        super(l);
        thickness = t;
    }
    /**
     * constructor
     * pre: none
     * post: Creates a RectangularPrism object with a length of l, a width of w, and a thickness of t.
     * @param l, w, t
     */
    RectangularPrism(float l, float w, float t){
        super(l,w);
        thickness = t;
    }
    
    
    /**
     * Get the volume of the rectangular prism
     * pre: none
     * post: returns the volume of the prism
     * @return volume
     */
    public float volume(){
        return(area() * thickness);
    }
    
}
