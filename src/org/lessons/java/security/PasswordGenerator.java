package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Inserisci il tuo nome");
		String nome = input.nextLine();
		System.out.println("Inserisci il tuo cognome");
		String cognome = input.nextLine();
		System.out.println("Inserisci il tuo colore preferito ");
		String colore = input.nextLine();
		System.out.println("Inserisci la data di nascita in ordine giorno poi mese e poi anno ");
		int dataNascita = input.nextInt();
		int meseNascita = input.nextInt();
		int annoNascita = input.nextInt();
		int sommaNascita = dataNascita + meseNascita + annoNascita;
		
		System.out.println("Questa sarebbe la tua password poco sicura :  " + nome + "-" + cognome + "-" + colore + "-" + sommaNascita );
		
	}
		
}
