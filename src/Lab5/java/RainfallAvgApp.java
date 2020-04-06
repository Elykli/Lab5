package Lab5.java;
/**
2D Arrays Problems
Compute the average of the rainfall values stored each day for 4 weeks
 RainfallAvgApp
 -- prompts the user to input the rainfall values for 4 weeks
 -- calculates the average of the rainfall
 -- displays the values from the rainfall 2D array
 */
import java.util.*;
import java.text.*;//decimal format
public class RainfallAvgApp {

	public static void main(String[] args) {
		// decalre and create 2D array with 4 weeks(rows) 7 days(columns)
		int rainfall [][] = new int [4][7];
		
		//input
		Scanner sc = new Scanner(System.in);
		
		//ask the user to input data
		//traverse the 2D [] by using outer and inner loops
		//store the values provided by the user
		for(int row = 0; row<rainfall.length; row++) {
			for(int col =0; col<rainfall[row].length; col++) {
				System.out.println("Enter value for week: "+ (row+1) +"day "+ (col+1) +": ");
			//read the value entered by userand save in to 2D[]
				rainfall[row][col] = sc.nextInt();
			}
			
		}
		//processing
		//calculate the sum of all elements of the[]
		//how many elements the array contains
		
		int sum = 0;
		int counter = 0;//number of elements in 2d []
		double average;
		
		for(int row = 0; row<rainfall.length; row++) {
			for(int col=0; col<rainfall[row].length; col++) {
				//add the current element from the [] rainfall to sum
				sum = sum+rainfall[row][col];
				//another eleent has been added to sum
				//the element from [row][col] 
				counter++;
			}
		}
		//compute avg of all the elements in []
		average = (double)sum/counter;
		
		//output
		System.out.println();
//		System.out.println("Average: " + average);
		DecimalFormat df = new DecimalFormat("####0.00");
		System.out.println("Average " + df.format(average));
		
		//output the 2D [] -the data user entered
		System.out.println("==============");
		System.out.println("The rainfall values are: ");
		
		for(int row=0; row<rainfall.length; row++) {
			for (int col=0; col<rainfall[row].length; col++) {
				System.out.print(rainfall[row][col] + " ");
			}
			System.out.println();
		}
		
	}//main

}
