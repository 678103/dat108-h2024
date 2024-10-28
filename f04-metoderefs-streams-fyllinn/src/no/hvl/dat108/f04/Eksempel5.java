package no.hvl.dat108.f04;

import static no.hvl.dat108.f04.People.people;

import java.util.ArrayList;
import java.util.List;

/*
 * Eksempel4
 * 
 * Vårt andre stream()-eksempel.
 * Lage en liste av etternavnene til de som er over 50 år.
 */
public class Eksempel5 {

	public static void main(String[] args) {
		
		//2 - Lage en liste av etternavnene til de som er over 50 år
		
		//Gamlemåten:		
		List<String> etternavnene = new ArrayList<>();
		for(Person p : people) {
			if (p.age() > 50) {
				etternavnene.add(p.lastName());
			}
		}
		System.out.println(etternavnene);
		
		//Med streams (ligner på SQL?):		
	

		people.stream()	//syntaks viser FROM people
			
		// WHERE age > 50
			.filter( p -> p.age() > 50); // hvis du trenger flere filtre så kan du lage flere filtre for å filtre ut eller legge på en && 
		
		
		// .map (p -> p.lastName()); = gjøre dette om til metodekall:
				.map (Person :: lastName) // SELECT lastname 
				.toList(); 
				System.out.print(resultat);
		
	}
}














