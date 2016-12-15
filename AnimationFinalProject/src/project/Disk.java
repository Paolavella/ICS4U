package project;
/**
 * Circle class
 * */
public class Disk extends Circle {
	private double thickness;
	/**
	 *Constructor
	 *pre: none
	 * a Disk has been created with a radius r and the tickness t.
	 */

	public Disk(double r, double t){
		super(r);
		thickness =t;
		
	}
	
	/**
	 * Changes the tickness of the disk.
	 * pre: none
	 * post: Thickness has been changed.
	 */
	public void setThickness(double newThickness){
		thickness = newThickness;
	}

	/**
	 * Returns the thickness of the disk.
	 * pre: none
	 * post:The tickness of the disk has been returned.
	 */
	public double getThickness(){
		return(thickness);
	}
	/**
	 * Returns the thickness of the disk.
	 * pre: none
	 * post:The volume of the disk has been returned.
	 */
	public double volume(){
		double v;
		
		v= super.area()* thickness;
		return v;
	}
	 
	/**
	 * Deter4minates if the object is equal to another Disk object
	 * pre: d is a disk object.
	 * post: true has been returnes if the objects have the same radii and thickness. false has been returned otherwise.
	 */
	public boolean equals(Object d){
	Disk testObj = (Disk)d;
	
	
	if (testObj.getRadius()==super.getRadius() && testObj.getThickness()==thickness){
		return (true);
	}
	else
		return (false);
	}

	
	/**
	 * Returns a String that Repersents the Disk object.
	 * pre: none 
	 * post: A string representing the disk object has been returned;
	 */
	
	public String toString(){
		String diskString;
		
		diskString = "The disk has a radius "+super.getRadius()+ " and thickness " + thickness + ".";
		return(diskString);	
		}
	
	
}
