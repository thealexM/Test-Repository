package Morales_p1;

import java.util.Scanner;

public class Morales_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the Data Encrypter!");

		System.out.println("");
			
		System.out.println("Enter a four digit integer you would like to encrypt:");

		System.out.println("");
			
		int inVal = scnr.nextInt();
		
		int w = inVal;
		int x = inVal;
		int y = inVal;
		int z = inVal;
		
		w = w / 1000;
		x = (x / 100) % 10;
		y = (y / 10) % 10;
		z = z % 10;
		
		w = (w + 7) % 10;
		x = (x + 7) % 10;
		y = (y + 7) % 10;
		z = (z + 7) % 10;

		System.out.println("");
			
		System.out.println("Your data has been encrypted!");

		System.out.println("");
			
		System.out.print(y);
		System.out.print(z);
		System.out.print(w);
		System.out.println(x);

		System.out.println("");
			
		System.out.println("Thank you for using the data encrypter!");
			

	}

}
