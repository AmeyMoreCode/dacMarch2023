package Assign_2;

import java.util.Scanner;


class Toll{
	
	private String vehicleType;
	private int numberAxles;
	private double tollFee;
	private double distanceTravelled;
	private double totalAmountDue;
	public static Scanner sc = new Scanner(System.in);
	
	Toll(){
		
	}
	
	public Toll(String vehicleType, int numberAxles, double tollFee, double distanceTravelled, double totalAmountDue) {
		super();
		this.vehicleType = vehicleType;
		this.numberAxles = numberAxles;
		this.tollFee = tollFee;
		this.distanceTravelled = distanceTravelled;
		this.totalAmountDue = totalAmountDue;
	}



	public String getVehicleType() {
		return vehicleType;
	}



	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}



	public int getNumberAxles() {
		return numberAxles;
	}



	public void setNumberAxles(int numberAxles) {
		this.numberAxles = numberAxles;
	}



	public double getTollFee() {
		return tollFee;
	}



	public void setTollFee(double tollFee) {
		this.tollFee = tollFee;
	}



	public double getDistanceTravelled() {
		return distanceTravelled;
	}



	public void setDistanceTravelled(double distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}



	public double getTotalAmountDue() {
		return totalAmountDue;
	}



	public void setTotalAmountDue(double totalAmountDue) {
		this.totalAmountDue = totalAmountDue;
	}



	public double calculateTollFee(){
		
            
			if( "cars".equals(getVehicleType()) || "vans".equals(getVehicleType()) || "buses".equals(getVehicleType()) ) {
			
			double toll =  0.25 * getDistanceTravelled() * getDistanceTravelled();

			return toll;
				
		}else if ("trucks".equals(getVehicleType())) {
			
			double toll =  0.50 * getDistanceTravelled() * getDistanceTravelled();

			return toll;
			
		}
		else {
			System.out.println("invalid");
		}
		return 0;
		
		
	}
	
	   public void  generateBill () {
		  //System.out.println(calculateTollFee());

		 double totalAmountDue = 2.00;
		   
		 double billGenrated = calculateTollFee() + totalAmountDue ;
		 
		System.out.println("Bill amount of "+getVehicleType()+" is "+billGenrated);
			
		}

	    public  void showMenu() {
		
		System.out.println("Enter vehicle type:- cars / vans / buses/ trucks ");
		this.vehicleType = sc.next(); 
		System.out.println("Enter number of axles");
		this.numberAxles = sc.nextInt();
		System.out.println("Enter distance travelled");
		this.distanceTravelled = sc.nextDouble();
		
//		System.out.println("Calculate toll fee");
//		System.out.println("Generate bill");
//		System.out.println("Exit");

	}
	    public static  int menuList() {
	    	System.out.println("0 exit");
			System.out.println("1 acceptDetails");
	        System.out.println("2 Generate Bill");
	        return sc.nextInt();
		}
}

public class TollBooth {
	public static void main(String[] args) {
		int choice;
		//Test12 ab=new Test12();
		Toll value = new Toll();
		while((choice =Toll.menuList()) !=0  ) {
			switch (choice) {
			case 1: {
				
				value.showMenu();
				break;
			}
			case 2: {
				
				value.generateBill();
				break;
			}
			
		}
	
		
	}
		
		
	}

}
/*
static Scanner sc = new Scanner(System.in);
static int menuList( ){
  System.out.println("0.Exit");
  System.out.println("1.Push");
  System.out.println("2.Pop");
  System.out.print("Enter choice  : ");
  return sc.nextInt();
}
public static void main(String[] args) {
  int choice, element;
  Stack stk = new Stack( 7 );
  while( ( choice = Program8.menuList( ) ) != 0 ){
    try{
      switch( choice ){
        case 1:
          System.out.print("Enter element : ");
          element = sc.nextInt();
          stk.push( element );
          break;
        case 2:
          element = stk.peek();
          System.out.println("Removed elemenet is : "+element);
          stk.pop();
          break;
      }
    }catch( Exception ex ){
      System.out.println(ex.getMessage());
    }
  }
}
*/