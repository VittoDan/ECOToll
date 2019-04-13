package Veicolo;

public class VeicoloStandardEuropeo extends VeicoloStandard {

	private ClasseAmbienteVeicolo classeAmbientale;
	public VeicoloStandardEuropeo(int assi,float altezza) {super();}
	public VeicoloStandardEuropeo(int assi,float altezza,int anno) {super();}
	public VeicoloStandardEuropeo(int assi,float altezza,int anno,String modello) {super();}
	public VeicoloStandardEuropeo(int assi,float altezza,int anno,String modello,String marca) {super();}
	public ClasseAmbienteVeicolo getClasseambientale() {return classeAmbientale ;}//vedere enum associato
	public void setClasseambientale(ClasseAmbienteVeicolo classeambientale) {;}//vedere enum associato
	@Override
	public String toString() {
		return super.toString()+" Nello standard europeo la sua classe ambientale è "+classeAmbientale;
	}
	
}
