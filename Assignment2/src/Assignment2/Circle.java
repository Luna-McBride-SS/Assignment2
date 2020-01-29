package Assignment2;

public class Circle implements Shape{
	int rad; //The radius of the circle
	double pi=3.14159; //PI, set to all the decimal places memorized
	
	public Circle(int radius) { //Constructor for the circle
		rad=radius; //Get the radius of the circle
	}
	@Override
	public double calculateArea() { //Method to get the area of the circle
		double area=pi*rad*rad; //Calculates the area of the circle (pi*r^2)
		return area; //Returns the area
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
