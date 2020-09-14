package Morales_p1;

import java.util.Scanner;

public class Morales_p1_decrypter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the Data Decrypter!");

		System.out.println("");
			
		System.out.println("Please enter a four digit integer you would like to decrypt:");

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
		
		w = (w + 3);
		x = (x + 3);
		y = (y + 3);
		z = (z + 3);

		System.out.println("");
			
		System.out.println("Your data has been decrypted!");

		System.out.println("");
			
		System.out.print(y);
		System.out.print(z);
		System.out.print(w);
		System.out.println(x);

		System.out.println("");
			
		System.out.println("Thank you for using the data decrypter!");
		
	}

}
