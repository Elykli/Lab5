package Lab5.java;
import java.util.*;
public class RainfallMaxApp {
	public static void main(String[]args) {
		//declare 2d[]
		double rainfall[][];
		//set the size for 4 weeks 7 days
		rainfall = new double [4][7];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of weeks: ");
		int weeks = sc.nextInt();
		
		System.out.println("Please enter number of days per week: ");
		int days = sc.nextInt();
		
		//create a 2d[] with as many rows as user provided for weeks as many col as user provided for days
		rainfall = new double[weeks][days];
		//input
		//traverse the 2d[] by using loop
		//store the values provided by the user
		for(int row=0; row<rainfall.length; row++) {
			for(int col=0; col<rainfall[row].length; col++) {
				System.out.println("Enter rainfall value for week:"+(row+1)+"day "+(col+1) +": " );
				rainfall[row][col] = sc.nextDouble();
			}
		}
		//processing
		//calculate the max value in []
		double max;
		max = rainfall[0] [0];
		
		//traverse the 2d[] using loops
		for(int row=0; row<rainfall.length; row++) {
			//retrieve the curretn row, located at the index given by the valeu of the row
			double r[] = rainfall[row];
			//traverse all the elemnt of current row
			for(int col=0; col<r.length; col++) {
				//if the value of max variable is lower than the current element from the rainfall[], than update the max with that element
				if(max<rainfall[row][col]) {
					//a new max value has been found
					max = rainfall[row][col];//store the value of current element in the max
				
				}//if
			}//inner loop
			
		}//outer loop
		//output
		System.out.println("Max is: " +max);

	}//main

}
