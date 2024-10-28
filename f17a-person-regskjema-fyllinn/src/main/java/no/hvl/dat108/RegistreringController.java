package no.hvl.dat108;

import javax.management.modelmbean.ModelMBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Legg merke til denne importen!
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistreringController {
	// Kode for controller-metoden

 @PostMapping ("/registrer") // -> obs! dette må samsvare med HTML-delen! 
	public String taImotRegistrering (String fornavn, String etternavn, int fodselsaar) { // metode med eget navn og tilhørende parametre, 
											// slik som HTML-del
		Person p = new Person(fornavn, etternavn, fodselsaar);
		model.addAttribute("person",p);
		return "kvittering";
	}
	
}
