package Assignment2;

public class Square implements Shape {
	int side; //Variable to hold a single side, as a square has all the same length of sides
	
	public Square(int width) { //Constructor for the square
		side=width; //Get our side length for the square
	}
	@Override
	public double calculateArea() { //Method to get the square's area
		double area=side*side; //Calculate the area (length*width, but with all sides the same length)
		return area; //Return the area of the square
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
