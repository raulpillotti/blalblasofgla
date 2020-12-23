package vetores;

import java.util.Scanner;

import entities.Product;
 

public class Main {

	public static void main(String[] args) {

	 

		int i;
		
		Scanner sc = new Scanner (System.in)

		int n = sc.nextInt();
		
		Product [] vect = new Product [n];
		
		for(i=0; i<vect.length; i++) {
			System.out.println();
			
			String name = sc.nextLine();
			double price  = sc.nextDouble();
			
			vect[i] = new Product (name, price);
			
			
		}
		
		 
		double soma = 0;
		
		for(i=0; i<vect.length; i++) {
			soma += vect[i].getPrice();
			
		}
		
		double avg = soma/n;
		
		System.out.printf("Resultado : %.2f", avg);
		
		sc.close();
		 

	}

}
