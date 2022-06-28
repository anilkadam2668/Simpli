package Basic;

 class Complexnumber {
	 int real;
	 int imag;
	 
	 public Complexnumber(int r,int i) {
		 this.real=r;
		 this.imag=i;
	 }
	 public void show(){
		 System.out.println(this.real+"i"+this.imag);
	 }
	  // function for addition
	 public static Complexnumber add(Complexnumber n1,Complexnumber n2) {
		
		// creating blank complex number
	    // to store result
		 Complexnumber res=new Complexnumber(0,0);
		 res.real=n1.real+n2.real;
		 
		 res.imag=n1.imag+n2.imag;
		return res;
		 
	 }
	
	public static void main(String[] args) {
		// creating two complex numbers
		Complexnumber c1=new Complexnumber(4,5);
		Complexnumber c2=new Complexnumber(10,5);
		
		// printing complex numbers
		System.out.println("1st comp num");
		c1.show();
		
		
		System.out.println("\n2nd comp num");
		c2.show();
		
		 // calling add() to perform addition
		Complexnumber res=add(c1,c2);
		
		 // displaying addition
		System.out.println("\nAddition is:");
		res.show();
		

	}

}
