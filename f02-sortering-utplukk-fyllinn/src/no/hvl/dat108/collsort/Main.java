package no.hvl.dat108.collsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		//1. Sortere i "naturlig" rekkefølge i hht. String compareTo. OK
		List<String> listen = Arrays.asList("Hallo", "blabla", "knut", "Per");
		Collections.sort(listen);
		System.out.println(listen);
		
		//2. Sortere alfabetisk uavhengig av store og små bokstaver (linje nr 2 når du kjører)
		listen.sort((a, b) -> a.toLowerCase().compareTo(b.toLowerCase()));
		System.out.println(listen);
		
		//3. ..., nå med lambda-uttrykk !!! :)
		System.out.println(listen);
		
		//4. Sortere på lengden på strengene (med lambda-uttrykk)
		listen.sort((s1, s2) -> s1.length() - s2.length());
		System.out.println(listen);
		
		//5. Sortere på lengden synkende. Putte lambda-uttrykk inn i variabel.
			Comparator<String> lsynk = (s1, s2) -> s2.length() - s1.length();
			Collections.sort(listen,lsynk);
		System.out.println(listen);
	}
}

