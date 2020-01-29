package Assignment2;

public class Main {

	public static void main(String[] args) { //Main function to handle arguments
		if(args.length==0) { //If there was no input
			System.out.println("Please give some numbers"); //Tell user to try again
			return; //Close the program
		}
		int[] numbers=new int[args.length]; //Creates a new array to the length of the arguments 
		int index=0; //Variable to keep track of array placement
		
		//For loop to check all the given arguments to see if they are integers, and then hold them
		for(String num: args) {
			try {
				numbers[index]=Integer.parseInt(num); //Sets the argument to int if it is an integer
			}
			catch(Exception e) {
				System.out.println("Please give ONLY numbers"); //Tell user to try again because there was a non-integer
				return; //Close the program
			}
			index++; //Move the index up onw
		}
		Math ad=new Math(); //Create an instance of the math class
		int sum=ad.add(numbers); //Get the sum from the math add method
		
		System.out.println("The sum of the numbers given is " + sum); //Print the sum
		int[] maximum=ad.findMax(numbers); //Get the max and its location for the passed-in numbers
		System.out.println("In addition, the maximum of this list is " + maximum[0] + " at position " + maximum[1]); //Print the maximum
		
		int[] array={55,25,93,25,92}; //Create a preset array for max showing
		int[] max=ad.findMax(array); //Get the max of the preset array
		System.out.println("As for preset array {55,25,93,25,92}, the maximum is " + max[0] + " at position " + max[1]); //Print the preset maximum
	}

}
