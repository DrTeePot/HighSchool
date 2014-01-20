/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author trpot5670
 */


public class TestShapes {
    
    
    public static void main(String[] args) {
        Circle[] spots;
        spots = new Circle[5];
        spots[0] = new Circle();
        Circle spot = new Circle(10);
        Rectangle square = new Rectangle(1);
        spot.setRadius(3);

        System.out.println(spot.getRadius());
        System.out.println(spot.circumference());
        
                
    }
}
