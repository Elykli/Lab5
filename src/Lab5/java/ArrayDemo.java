package Lab5.java;

public class ArrayDemo {

	//declaree data members
	private int nums[][];

	public ArrayDemo() {
	
	}

	public void setNums(int[][] nums) {
		this.nums = nums;
	}

	public int[][] getNums() {
		return nums;
	}

	public void setArrayNumbers(int row, int col, int num) {
		nums[row][col] = num;
	}
	 
}
