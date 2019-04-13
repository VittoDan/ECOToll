package Autostrada;

import Veicolo.Veicolo;

public interface Percorso {
	
	public static float pedaggioPercorso(Autostrada au,Casello CaselloInizio,Casello CaselloFine) {
		return 0;
	}//ipotizzo che il percorso sia calcolato su singola autostrada
	public float distanza(Casello CaselloInizio,Casello CaselloFine);
	
}
