package no.hvl.dat108.f05;

import static no.hvl.dat108.f05.People.people;

public class Eks1reduce {
	
	public static void main(String[] args) {
		
		/* Summen av aldrene til personene i people-listen */
		int sumAlder = people.stream()
					.map( p -> p.age())
					.reduce(0, (akku, x) -> akku + x); 
					System.out.println("Sum alder er " + sumAlder);
					
					
	/* int sumAlder = people.stream()
					.map( Person :: age)   // blir som age() 
 					.reduce(0, Integer :: sum);  OBS; se forskjellen på dette og på syntaks ovenfor, dette blir enda mindre kode! 
 													Funkerer på samme måte
					System.out.println("Sum alder er " + sumAlder);
					
					
				Summering er såpass vanlig at vi kan utføre det på enda en måte (denne gjelder KUN for tall)
				Da kan vi bruke map (som gjør det om til en stream av tall). Da får vi plutselig mange forskjellige muligheter.
				Alt fra sum til gjennomsnitt osv. Kan nærmest skrive det på en linje: 
				
				int sumAlder = people.stream().mapToInt (Person::age).sum(); 
					System.out.println("Sum alder er " + sumAlder);
	*/
					
		/* En streng med alle initialene, "CD LC TC CB MA" */
					String initialer = people.stream()
							.map(p -> "" p.firstName().charAt(0) 
									+ p.lastName().charAt(0))
							.reduce("" (akku, s) -> akku + s + "");
					System.out.println(inits);
					
					// i stedet for å bruke reduce kan du bruke collect. 

	}	
}
