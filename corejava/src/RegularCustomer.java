
public class RegularCustomer extends Customer{
	//class variables
	String customerID;
	String customerName;
	String customerType;
	double amount;
	
	//constructor
	RegularCustomer(String custID, String custName, String custType, double amt){
	super(custID, custName, custType);
		
		this.customerID=custID;
		this.customerName=custName;
		this.customerType=custType;
		this.amount=amt;
	}
	//method
	double get_final_amount(double interest, int year) {
		double simple_interest=this.amount*interest*year;
		double amount=this.amount+simple_interest;
		
		
		if(this.customerType=="domestic") {
			//for regular customer type we are discounting 500 rupees
			return -500;
		}
		else if (this.customerType=="buisness") {
			return amount;
		}
		// besides the above types we will return the amount calculated
		return amount;
	}
	
}
