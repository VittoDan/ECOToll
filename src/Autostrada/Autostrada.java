package Autostrada;

import java.util.Arrays;

public class Autostrada implements Percorso {
		private String nome;
		private String tipo;//pianura,montagna ecc 
		private float tariffaUnitaria;//tariffa unitaria gestita dall'autostrada
		private  Casello [] listaCasello;//lista di caselli (va fatto un sorting in base ai chilometri)
		private float kilometri;//Distanza in chilometri dell'autostrada (calcolata con i caselli)
		private int maxCaselli;//numero massimo di caselli 
		private static int numeroCaselli=0;//numero caselli correnti
		public Autostrada(String tipo,float tunit,int maxCaselli,String nome) {;}
		private void OrdinaCaselli() {;}//metodo privato di sorting usato quando si aggiungono i caselli 
		/*getters e setters*/
		public float getTariffaUnitaria() {return 0;}
		public void setTariffaUnitaria(float tariffaUnitaria) {;}
		public Casello[] getListaCasello() {return null;}
		public String getTipo() {return "";}
		public void setTipo(String tipo) {;}
		public String getNome() {return "";}
		public void setNome(String tipo) {;}
		public void setListaCasello(Casello[] listaCasello) {;}
		public float getDistanza(Casello A, Casello B){return 0;}
		/*********************************************************/
		public void addCasello(Casello A) {;}
		public void addCasello(Casello [] A) {;}//prevista anche l'aggiunta di una lista di caselli
		public void rimuoviCasello(Casello A) {;}//prevista la rimozione di un caselli
		@Override
		public float distanza(Casello CaselloInizio, Casello CaselloFine) {return 0;}
		@Override
		public String toString() {
			
			return "L'autostrada "+nome+" è di tipo "+tipo+". La tariffa unitaria associata è di "+tariffaUnitaria+" euro. I caselli che compongono l'autostrada sono: "+listaCasello.toString()+" L'autostrada è lunga "+kilometri+" km";
		}
		
}
