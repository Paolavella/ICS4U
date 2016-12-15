package project;

/**
 * Puck class
 * */
public class Puck extends Disk {
	private double weight;
	private boolean standard=false;
	private boolean youth=false;
	/**
	 * constructor
	 * post: A Disk object has been created with radius r and weight w
	 * */

	public Puck(double r, double w){
		super (r, 1);
		weight =w; 
		if ((w<=4.5 && w>=4)){
			youth = true;
		}
		if ((w<=5.5 && w>=5)){
			standard = true;
		}
	}
	/**
	 * Changes the thickness of the disk. 
	 * pre: none
	 * post: Thickness has been changed.
	 * */
	public void setWeight(double newWeight){
		weight = newWeight;
	}
	/**
	 * Returns the thickness of the weight
	 * pre: none
	 * post: Weight has been changed.
	 * */
	public double getWeight(double newWeight){
		return(weight);
	}
	/**
	 * Determinates if the object is equal to another disk.
	 * pre: d is the Disk object.
	 * post: true has been returned if if the objects have the same radii and thickness. Otherwise false
	 **/
	public boolean equals(Object d){
		Puck testObj =(Puck)d;
		if(testObj.getRadius()== super.getRadius()&& testObj.getRadius() == weight){
			return (true);
		}
		return(false);

	}
	public String getDivison(){
		if(youth){
			return("Youth");}
		else 
			return ("Standard");
	}


	public String toString()
	{
		String diskString;
		diskString = "The disk has radius" + getDivison() + " and the weight"+ weight+".";	
		return (diskString);
	}	
	
}
