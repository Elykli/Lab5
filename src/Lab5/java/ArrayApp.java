package Lab5.java;
import java.util.*;
public class ArrayApp {

	public static void main(String[] args) {
		
		//declare 2D array
		int arr[][]= new int[][]{{1,2,3},{4,5,6},{7,8,9}};

		/*
		 c
		 o
		 l
	row 1 2 3
		4  5 6
		7 8 9 
		 */
//		System.out.println(arr[0][2]);
		
		for(int row = 0; row<arr.length; row++) {
			for(int col =0; col<arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		Scanner input = new Scanner(System.in);
		ArrayDemo myArr = new ArrayDemo();
		
		myArr.setNums(arr);
		
		for(int row=0; row<arr.length; row++) {
			for(int col = 0; col<arr[row].length; col++) {
				System.out.println("Please enter a number: ");
				int num = input.nextInt();
				myArr.setArrayNumbers(row, col, num);
			}
		}
		//output
		for(int row = 0; row<arr.length; row++) {
			for( int col=0; col<arr[row].length; col++) {
				System.out.print(arr[row][col]+ " ");
			}
			System.out.println();
		}
		
		
	}//main

}
