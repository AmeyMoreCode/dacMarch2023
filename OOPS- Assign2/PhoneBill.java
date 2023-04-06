package Assign_2;

import java.util.Scanner;

class PhoneBillFinal {
	
	String customerName;
	long phoneNo;
	int noOfCalls;
	double durnOfCalls;
	
	public void PhoneBill(String customerName, long phoneNo, int noOfCalls, double durnOfCalls) {
		//super();
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.noOfCalls = noOfCalls;
		this.durnOfCalls = durnOfCalls;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getNoOfCalls() {
		return noOfCalls;
	}

	public void setNoOfCalls(int noOfCalls) {
		this.noOfCalls = noOfCalls;
	}

	public double getDurnOfCalls() {
		return durnOfCalls;
	}

	public void setDurnOfCalls(double durnOfCalls) {
		this.durnOfCalls = durnOfCalls;
	}
	
	public double calculateBill()
	{
		double numberCall = getNoOfCalls();
		
			if(numberCall <= 100 ) {
				return (numberCall * 50) + 10;
				//total = cost;
				
			}
			else if(numberCall > 100) {
				return (numberCall * 25) + 10;
			}
			
			return 0;
			
	}
	
	    public void accept_record(){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name");
		this.customerName=sc.nextLine();
		
		System.out.println("Enter phone no");
		this.phoneNo=sc.nextLong();
		
		System.out.println("Enter Number Of Calls");
		this.noOfCalls=sc.nextInt();
		
		System.out.println("Enter duration Of Calls in minutes");
		this.durnOfCalls=sc.nextDouble();
		sc.close();
		}
	    
}
	
	public class PhoneBill {
		public static void main(String[] args) {
			PhoneBillFinal value=new  PhoneBillFinal();
			value.accept_record();
			
			System.out.println(value.calculateBill());
			
		}
	}
	
	


