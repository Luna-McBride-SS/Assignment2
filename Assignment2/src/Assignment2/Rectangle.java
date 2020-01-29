package Assignment2;

public class Rectangle implements Shape {
	int length; //Length of the rectangle
	int width; //Width of the rectangle
	
	public Rectangle(int length, int width) { //Constructor to set up the rectangle
		this.length=length; //Set the length of this rectangle
		this.width=width; //Set the width of this rectangle
	}
	@Override
	public double calculateArea() { //Method to calculate the rectangle's area
		double area=length*width; //Rectangle area (length times width)
		return area; //Returns the area
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
