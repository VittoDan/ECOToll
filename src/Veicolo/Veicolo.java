package Veicolo;

public class Veicolo {
	/*****************************variabili  di istanza***********************************/
	private enum classeveicolo{A,B,T,Q,C};
	private classeveicolo tipo;
	private String modello;
	private String marca;
	private int assi;
	private int anno;
	private float altezza;
	/*********************************Costruttori****************************************/
	public Veicolo() {;}
	public Veicolo(int assi,float altezza) {;}
	public Veicolo(int assi,float altezza,int anno) {;}
	public Veicolo(int assi,float altezza,int anno,String modello) {;}
	public Veicolo(int assi,float altezza,int anno,String modello,String marca) {;}
	/************************************************************************************/
	public classeveicolo getTipo() {return tipo;}
	public String getModello() {return "";}
	public String getMarca() {return "";}
	public int getAssi() {return 0;}
	public int getAnno() {return 0;}
	public float getAltezza() {return 0;}
	
	public void setModello(String modello) {;}
	public void setMarca(String marca) {;}
	public void setAssi(int assi) {;}
	public void setAnno(int anno) {;}
	public void setAltezza(float altezza) {;}	
}
