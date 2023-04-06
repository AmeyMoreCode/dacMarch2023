package Assign_2;

import java.util.Scanner;

class calculation{
	
		double height;
		double weight;
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	
	public double getWeight() {
		return this.weight;
	} 
	
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	public double Calculator() {
		double result = weight/(height * height);
		return result;
	}
	Scanner sc= new Scanner(System.in);
	static calculation aa=new calculation();
	public void getInput() {
	
		System.out.println("Enter Height");
		aa.setHeight(sc.nextDouble());
		
		System.out.println("Enter Weight");
		aa.setWeight(sc.nextDouble());
		
	}
	
	public void getOutput() {
		System.out.println("Bmi is "+this.height);
	}
	
}

public class BMI {
	public static void main(String[] args) {
		calculation aa=new calculation();
		aa.getInput();
		aa.getOutput();
		
		
	}

}
