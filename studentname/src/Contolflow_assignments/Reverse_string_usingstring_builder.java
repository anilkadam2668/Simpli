package Contolflow_assignments;

import java.util.Scanner;

public class Reverse_string_usingstring_builder {

	public static void main(String[] args) {
		//String str = "Automation";
        StringBuilder str2 = new StringBuilder();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please write word to reverse");
        String str=sc.nextLine();
        str2.append(str);
        str2 = str2.reverse();     // used string builder to reverse
       System.out.println(str2);

	}

}
