package Collections;

public class Hash {

	public static void main(String[] args) {
		String a="200";
		String B="400";
		if(a.equals(B)) {
			System.out.println("both are equal");
			System.out.println(a.hashCode()+ " "+B.hashCode());
		}
		else {
			System.out.println("False");
			System.out.println(a.hashCode()+ " "+B.hashCode());
		}

	}

}
