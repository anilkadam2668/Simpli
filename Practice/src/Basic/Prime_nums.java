package Basic;

class Prime_nums {
	static void prime_n(int N) {
		int x,y,flag;
		
		System.out.println("All prime nums are: "+N);
		
		 // the numbers from 1 to N
		for(x=1;x<N;x++) {
			 // Omit 0 and 1 as they are
            // neither prime nor composite
			if (x==1 || x==0) 
				continue;
			// Using flag variable to check
            // if x is prime or not
			flag=1;
			
			for (y=2;y<=x/2;y++) {
				if (x%y==0) {
					flag=0;
					break;
				}
			}
			if (flag==1)
				System.out.print(x+" ");
		}
	}
	
	

	public static void main(String[] args) {
		
int N=50;
prime_n(N);
	}

}
