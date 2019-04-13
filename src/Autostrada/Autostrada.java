package Autostrada;

public class Autostrada {
		private String tipo;//pianura,montagna ecc 
		private float tariffaUnitaria;
		private  Casello [] listaCasello;
		private float kilometri;
		private int maxCaselli;
		private static int numeroCaselli=0;
		public Autostrada(String tipo,float tunit,int maxCaselli) {;}
		private void OrdinaCaselli() {;}
		public float getTariffaUnitaria() {return 0;}
		public void setTariffaUnitaria(float tariffaUnitaria) {;}
		public Casello[] getListaCasello() {return null;}
		public String getTipo() {return "";}
		public void setTipo(String tipo) {;}
		public void setListaCasello(Casello[] listaCasello) {;}
		public float getDistanza(Casello A, Casello B){return 0;}
		public void addCasello(Casello A) {;}
		public void addCasello(Casello [] A) {;}
		public void rimuoviCasello(Casello A) {;}
}
