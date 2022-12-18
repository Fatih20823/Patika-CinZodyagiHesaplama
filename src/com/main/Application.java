package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		String Burc="";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dogum Yilinizi Giriniz: ");
		int DogumYili= input.nextInt();

		switch (DogumYili%12) {
		case 0:
			    Burc = "Maymun"; 
			break;
		case 1:
				Burc = "Horoz";
			break;
		case 2:
				Burc ="Kopek";
			break;
		case 3:
				Burc = "Domuz"; 
			break;
		case 4:
				Burc = "Fare"; 
			break;
		case 5:
				Burc = "Okuz"; 
			break;
		case 6:
				Burc = "Kaplan"; 
			break;
		case 7:
				Burc = "Tavsan"; 
			break;
		case 8:
				Burc = "Ejderha"; 
			break;
		case 9:
				Burc = "Yılan"; 
			break;
		case 10:
				Burc = "At"; 
			break;
		case 11:
				Burc = "Koyun";
			break;
		default:
			System.out.println("Yanlis Giris Yaptiniz !");
		}
		System.out.println("Cin Zodyagi Burcunuz: "+Burc);
		input.close();
	}

}
