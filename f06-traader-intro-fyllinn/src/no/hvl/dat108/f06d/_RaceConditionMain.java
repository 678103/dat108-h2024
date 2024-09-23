package no.hvl.dat108.f06d;

public class _RaceConditionMain {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * I dette eksempelet skal vi se at vi må beskytte delte ressurser
		 * mot potensiell samtidig oppdatering fra flere tråder ...
		 * 
		 * Vi lar to tråder ha tilgang til et (og samme) Teller-objekt.
		 * Den ene tråden prøver å øke verdien, mens den andre prøver å redusere verdien
		 *
		 * Vi skal se hvordan dette går, og evt. hva som kan/må gjøres for å
		 * få en mer "kontrollert" utførelse.
		 */
		
		//HER BLIR KODEN FEIL FORDI VI IKKE HAR ENDRET PÅ DEN KRITISKE SEKSJONEN
		// SOM LIGGER I Teller()-KLASSEN. DETTE GJEDER TELLOPP OG TELLNED
		Teller teller = new Teller();
		Thread TellOppTraad = new TelleOppTraad(teller, 10000);
		Thread TellNedTraad = new TelleNedTraad(teller, 10000); 
		
		TellOppTraad.start();
		TellNedTraad.start();
		
		TellOppTraad.join();
		TellNedTraad.join();
		
		System.out.println("Ferdig! Teller = " + teller.getVerdi() );

		// Her ser du at svarene vi får aldri vil bli 0! Vi må derfor finne ut hvor
		// det kritiske punktet er, og gjøre kodeblokken syncronized!!
		
	}

}
