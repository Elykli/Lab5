package Lab5.java;

public class RainfallAvgMaxMin {
	private double rainfall [] [];
    private double average;
    private double max;
    private double min;
    
	public void setRainfall(double[][] rainfall) {
		this.rainfall = rainfall;
	}

	public double getAverage() {
		return average;
	}

	public double getMax() {
		return max;
	}

	public double getMin() {
		return min;
	}
	
	public void calcAvg() {
		double sum = 0;
		int counter = 0;
		
		for(int row=0; row<rainfall.length; row++) {
			for(int col=0; col<rainfall[row].length; col++) {
			sum = sum + rainfall[row][col];
			counter++;
			}//inner
			
		}//outer
		average = (double)sum/counter;
		
	}
	
	public void calcMax() {
		max = rainfall [0][0];
		
		for(int row=0; row<rainfall.length; row++) {
			double r[] = rainfall[row];
			for(int col=0; col<r.length; col++) {
				if(max<rainfall[row][col]) {
					max = rainfall[row][col];
				
				}
			}
			
		}
		
	}//calcMax
	
	public void calcMin() {
		min = rainfall[0][0];
		
		for(int row=0; row<rainfall.length; row++) {
			double r[] = rainfall[row];
			for(int col=0; col<r.length; col++) {
				if(min>rainfall[row][col]) {
					min = rainfall[row][col];
				}
			}
		}
	}//calcMin
    
    
}//class
