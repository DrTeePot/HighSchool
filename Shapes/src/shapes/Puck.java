/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shapes;

/**
 *
 * @author rkaune
 */
public class Puck extends Cylinder {
    public double MIN_STANDARD_WEIGHT = 5;
    public double MAX_STANDARD_WEIGHT = 5.5;
    public double MIN_YOUTH_WEIGHT = 4;
    public double MAX_YOUTH_WEIGHT = 4.5;
    private double weight;
    private boolean standard, youth ;

    /**
     * constructor
     * pre: none
     * post: A Puck object has been created with the weight w.
     * standard and youth are set depending on the weight
     */
    public Puck (double w) {
        super(1.5,1.0);
        weight = w;
        if (weight >=MIN_STANDARD_WEIGHT && weight <=MAX_STANDARD_WEIGHT ){
            standard = true;
            youth = false;
        }
        else {
            youth= true;
            standard = false;
        }
    }

    /**
	 * Returns the weight of the puck.
	 * pre: none
	 * post: The weight of the puck has been returned.
	 */
	public double getWeight() {
	 	return(weight);
	}

        /**
	 * Returns the division.
	 * pre: none
	 * post: The division of the puck has been returned.
	 */
	public String getDivision() {
            String div;
            if (standard) {
                div= "Puck is standard";
            }
            else {
                div= "Puck is youth";
            }
            return(div);
	}


        /**
	 * Determines if the object is equal to another
	 * Puck object.
	 * pre: none
	 * post: true has been returned if the objects have
	 * the same division. false has
	 * been returned otherwise.
	 */
        @Override
	public boolean equals(Object obj) {
		Puck testObj = (Puck)obj;

	 	if (testObj.getDivision() == getDivision() ) {
			return(true);
		} else {
			return(false);
		}
	}


	/**
	 * Returns a String that represents the Puck object.
	 * pre: none
	 * post: A string representing the Puck object has
	 * been returned.
	 */
        @Override
	public String toString() {
		String puckString;

		puckString = "The puck has weight " + getWeight() +
					 " and division" + getDivision() + ".";
	 	return(puckString);
	}


}
