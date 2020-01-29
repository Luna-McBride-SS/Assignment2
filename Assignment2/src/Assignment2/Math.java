package Assignment2;

public class Math { //Class made to handle the maths sent to it
	public int add(int[] nums) { //Method to sum up the integers in the passed-in array
		int finalSum=0; //Variable made to hold the numbers as they built to the final sum
		
		//Sums up the numbers from the nums array
		for(int number: nums) {
			finalSum+=number; //Actual sum operation
		}
		return finalSum; //Return the final sum
	}
	
	public int[] findMax(int[] nums) { //Method to find the placement and max value in the given array
		int[] answer= {-999,-1}; //Array to pass the final values back, as java does not allow two return values
		int index=0; //Variable to hold array placement
		
		//For loop to find the maximum value and its placement
		for(int givenNumber: nums) {
			if (givenNumber>answer[0]) { //If the new value is bigger than the last biggest
				answer[0]=givenNumber; //Set the new biggest value
				answer[1]=index; //Set the place in the array
			}
			index++; //Increase the value in the placement-tracking variable
		}
		return answer; //Returns the max value and its placement
	}
}
