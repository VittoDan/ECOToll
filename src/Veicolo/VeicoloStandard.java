package Veicolo;



public class VeicoloStandard implements Veicolo {
	/*****************************variabili  di istanza***********************************/
	private ClasseVeicolo tipo;
	private String modello;
	private String marca;
	private int assi;
	private int anno;
	private float altezza;
	/*********************************Costruttori****************************************/
	public VeicoloStandard() {;}
	public VeicoloStandard(int assi,float altezza) {;}
	public VeicoloStandard(int assi,float altezza,int anno) {;}
	public VeicoloStandard(int assi,float altezza,int anno,String modello) {;}
	public VeicoloStandard(int assi,float altezza,int anno,String modello,String marca) {;}
	/************************************************************************************/
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
}