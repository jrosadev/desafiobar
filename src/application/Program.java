package application;

import java.util.Scanner;

import util.Bill;

public class Program {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		Bill bill = new Bill();
		System.out.print("Gênero: ");
		bill.gender = sn.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sn.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sn.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sn.nextInt();
		
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$%.2f%n", bill.feeding());
		System.out.printf("Couvert = R$%.2f%n", bill.cover());
		System.out.printf("Ingresso = R$%.2f%n", bill.ticket());
		System.out.printf("Valor a pagar = R$%.2f%n", bill.total());		
		
		sn.close();			
	}

}
