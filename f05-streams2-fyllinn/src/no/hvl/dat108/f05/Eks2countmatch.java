package no.hvl.dat108.f05;

import static no.hvl.dat108.f05.People.people;

public class Eks2countmatch {

	public static void main(String[] args) {

		//Alle forbokstavene i fornavnene i en streng "CLTCM" - reduce() 
		
		//Antall personer over 50 år - count()
			long antallOver50 = people.stream()
					.filter(p -> p.age() > 50)
					.count();
				System.out.println(antallOver50);
					
		
		//Om vi har data som matcher - anyMatch(), allMatch(), noneMatch()
		//Er alle over 30 år?
		//Er noen over 60 år?
				
				boolean alleOver30 = people.stream()
						.anyMatch(p -> p.age() > 60);
						
						System.out.println(noenOver60);
	}

}




