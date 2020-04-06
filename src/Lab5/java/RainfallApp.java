package Lab5.java;
import java.util.*;
import java.text.*;
public class RainfallApp {

	public static void main(String[] args) {
		double rainfall[][];
		double avg, min, max;
		
		RainfallAvgMaxMin rainF = new RainfallAvgMaxMin();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of weeks: ");
		int weeks = sc.nextInt();
		
		System.out.println("Please enter number of days per week: ");
		int days = sc.nextInt();
		System.out.println();
		
		rainfall = new double[weeks][days];
		
		for(int row=0; row<rainfall.length; row++) {
			for(int col=0; col<rainfall[row].length; col++) {
				System.out.println("Enter rainfall value for week: "+(row+1)+" day "+(col+1) +": " );
				rainfall[row][col] = sc.nextDouble();
			}
			System.out.println();
		}
		
		rainF.setRainfall(rainfall);
		rainF.calcAvg();
		rainF.calcMax();
		rainF.calcMin();
		
		avg = rainF.getAverage();
		min = rainF.getMin();
		max = rainF.getMax();
		
		DecimalFormat df = new DecimalFormat("####0.00");
		System.out.println("Average rainfall value is: " + df.format(avg));
		System.out.println("Maximum rainfall value is: " + max);
		System.out.println("Minimum rainfall value is: " + min);
		
				
	}//main

}
