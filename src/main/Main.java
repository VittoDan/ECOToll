package main;

import Autostrada.Autostrada;
import Autostrada.Casello;
import Autostrada.Pedaggio;
import Autostrada.Percorso;
import Veicolo.Veicolo;
import Veicolo.VeicoloStandard;
import Veicolo.VeicoloStandardEuropeo;

public class Main {
	public static void main(String[] args) {
		 Autostrada a4= new Autostrada("Pianura",2,13,"a4");
		 Autostrada a24= new Autostrada("Montagna",3,20,"a24"); 
		 Casello brescia=new Casello(10,"Brescia");
		 Casello rovato=new Casello(30,"Rovato");
		 a4.addCasello(brescia);
		 a4.addCasello(rovato);
		 Casello [] casellia24 = null;
		 casellia24[0]=new Casello(15,"Tivoli");
		 casellia24[1]=new Casello(20,"Carsoli");
		 casellia24[2]=new Casello(25,"Tagliacozzo");
		 a24.addCasello(casellia24);
		 Veicolo generico;
		 VeicoloStandard panda=new VeicoloStandard(2,(float)1.40,2000);
		 VeicoloStandard centoventisette=new VeicoloStandard(2,(float)1.30,1983,"fiat");
		 VeicoloStandardEuropeo vaz= new VeicoloStandardEuropeo(2,(float)1.30,1977,"VAZ-2101");
		 Casello [] listaA4=a4.getListaCasello();
		 a4.getDistanza(listaA4[0], listaA4[listaA4.length]);
		 Pedaggio.pedaggio(a4, vaz);
		 Pedaggio.pedaggio(a24, vaz);
		 Pedaggio.pedaggio(a4, panda);
		 Pedaggio.pedaggio(a24, panda);
		 Pedaggio.pedaggio(a4, centoventisette);
		 Pedaggio.pedaggio(a24, centoventisette);
		 a4.distanza(listaA4[0], listaA4[listaA4.length]);
		 
		 
	}
}
