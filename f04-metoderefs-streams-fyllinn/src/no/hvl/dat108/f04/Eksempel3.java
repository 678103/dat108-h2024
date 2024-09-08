package no.hvl.dat108.f04;

import static java.util.Comparator.comparing;
import static no.hvl.dat108.f04.People.people;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

/*
 * Eksempel3
 * 
 * I dette eksempelet skal vi se litt på metoden comparing(), og hvordan
 * denne kan brukes der det forventes en Comparator.
 * Vi ser også på hvordan en slik comparing-metode kan implementeres,
 * f.eks. om den ikke allerede fantes.
 */
public class Eksempel3 {

	public static void main(String[] args) {
		
		//1 - Sortering på etternavn ved å gi inn en Comparator som 2. parameter
		Collections.sort(people, (a,b) -> a.lastName().compareTo(b.lastName()));
		
		//2 - Ofte ser vi kode som dette
		Collections.sort(people, comparing(p -> p.lastName()));

		//3 - Eller (enda bedre) ved å bruke metodereferanse
		Collections.sort(people, comparing(Person::lastName));

		//4 - Hvordan virker egentlig Comparator.comparing()?
		//		Kan vi forstå litt mer ved å lage en slik metode selv?
		
//		Collections.sort(people, vedAaSammenligne(Person::age));
		Collections.sort(people, vedAaSammenligne(Person::firstName));
		people.forEach(System.out::println);
	}

	
	/*
	 * Vår egen utgave av Comparator.comparing(...).
	 * Sjekk gjerne ut API-doc til Comparator.comparing(), og se om det ligner.
	 */
	static <T, U extends Comparator<U>> Comparator<T> vedAaSammenligne(Function<Person, String> xtractor ) { // vi ser i main-metoden (linje 26) gir comparing(p -> p.lastName())); 
																			// dvs fra et objekt til en string. Da må vi bruke funksjon i denne klassen
		return (a,b) -> a.xtractor.apply(a).compareTo(xtractor.apply(b));
	}

}


















