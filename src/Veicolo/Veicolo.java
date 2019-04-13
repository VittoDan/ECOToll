package Veicolo;
/*Generica interfaccia di veicolo*/
public interface Veicolo {
	public ClasseVeicolo getTipo();
	public String getModello();
	public String getMarca();
	public int getAssi();
	public int getAnno();
	public float getAltezza();
	public void setModello(String modello);
	public void setMarca(String marca);
	public void setAssi(int assi);
	public void setAnno(int anno);
	public void setAltezza(float altezza);	
	
}
