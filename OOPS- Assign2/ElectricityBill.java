package Assign_2;

import java.util.Scanner;

class ElectricityBill {
	
	private static String customerName; 
	private static double unitsConsumed; 
	private double billAmount;
	
	ElectricityBill(){
		//todo
	}
	
	ElectricityBill(String customerName, double unitsConsumed ){
		//calculateBillAmount(unitsConsumed);
		this.customerName = customerName;
		this.unitsConsumed = unitsConsumed;
		//System.out.println(customerName);
		//System.out.println(unitsConsumed);
	}
	
	public double calculateBillAmount() {
		double units=this.unitsConsumed;
		
		if(units<100) {
			this.billAmount = (5 * units);
			
		}else if(units>100 && units<200){
			this.billAmount = (7 * units);
		}
		else {
			this.billAmount = (10 * units);
		}
		return billAmount;
		
		
		
	}
	
//	public void getUser() {
//		
//		
//		
//	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter User name");
			String customerName = sc.next();
			
			System.out.println("Enter units");
			double unitsConsumed = sc.nextDouble();
			
			ElectricityBill call=new ElectricityBill(customerName,unitsConsumed );
			///call.getUser();
			//call.ElectricityBill();
			//ElectricityBill call=new ElectricityBill(customerName,unitsConsumed);
			
		    double amount = call.calculateBillAmount();
		    
			System.out.println("Customer name "+call.customerName);
			System.out.println("unit cosumed "+call.unitsConsumed);
			System.out.println("Total Amount "+amount);
			
			
		}
}

