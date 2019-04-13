package Veicolo;



public class VeicoloStandard implements Veicolo {
	/*****************************variabili  di istanza***********************************/
	private ClasseVeicolo tipo;//tipo deciso dal costruttore con un enum (dipende dal numero di assi e dall'altezza del veicolo)
	private String modello;//modello dell'auto
	private String marca;//marca dell'auto
	private int assi;//numero di assi del veicolo
	private int anno;//anno di immatricolazione
	private float altezza;//altezza del veicolo
	/*********************************Costruttori****************************************/
	/*******************Nei costruttori verrà calcolato il tipo**************************/
	public VeicoloStandard() {;}//costruttore di default (non supportato)
	public VeicoloStandard(int assi,float altezza) {;}//costruttore(minimale)
	public VeicoloStandard(int assi,float altezza,int anno) {;}
	public VeicoloStandard(int assi,float altezza,int anno,String modello) {;}
	public VeicoloStandard(int assi,float altezza,int anno,String modello,String marca) {;}
	/******************************Getters e setters************************************/
	public ClasseVeicolo getTipo() {return tipo;}
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
	@Override
	public String toString() {
		return "Il veicolo "+marca+" "+modello+" è un veicolo a "+assi+" assi"+" e alto "+altezza+" quindi di tipo "+tipo+" l'anno di immatricoloazione è "+anno;
	}	
}