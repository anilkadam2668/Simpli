package controlflow;

import java.util.Scanner;

public class VowelSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Any character");
		char c1=sc.nextLine().charAt(0);
		switch(c1)
		{
		case 'a':
			System.out.println("its vowel");
			break;
		case 'e':
			System.out.println("its vowel");
			break;
		case 'i':
			System.out.println("its vowel");
			break;
		case 'o':
			System.out.println("its vowel");
			break;
		case 'u':
			System.out.println("its vowel");
			break;
			default:
				System.out.println("its not vowel");
			
		}

	}

}
