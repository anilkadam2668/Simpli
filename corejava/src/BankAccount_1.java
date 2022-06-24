
public class BankAccount_1 {
	
	public static void main(String[] args) {
		
		RegularCustomer regcust1=new RegularCustomer("R123","Abd","domestic",10000);
		RegularCustomer regcust2=new RegularCustomer("R245", "King","buisness",10000 );
		
		EnterpriceCustomer entcust1=new EnterpriceCustomer("E88", "Abhi", "smallscale", 10000);
		EnterpriceCustomer entcust2=new EnterpriceCustomer("E89", "Amo", "bigscale", 10000);
		
		//Regular customer
		regcust1.showCustomerDetails();
		System.out.println("Final amount: "+regcust1.get_final_amount(5, 8));
		
		regcust2.showCustomerDetails();
		System.out.println("Final amount: "+regcust2.get_final_amount(5, 8));
		
		//Enterprise customer
		entcust1.showCustomerDetails();
		System.out.println("Final amount: "+entcust1.get_final_amount(5, 8));
		
		entcust2.showCustomerDetails();
		System.out.println("Final amount: "+entcust2.get_final_amount(5, 8));
	}

}
