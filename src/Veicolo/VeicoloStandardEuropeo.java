package Veicolo;

public class VeicoloStandardEuropeo extends Veicolo {
	private enum classeAmbienteTipo{E1,E2,E3,E4,E5,E6};
	private classeAmbienteTipo classeambientale;
	public VeicoloStandardEuropeo(int assi,float altezza) {super();}
	public VeicoloStandardEuropeo(int assi,float altezza,int anno) {super();}
	public VeicoloStandardEuropeo(int assi,float altezza,int anno,String modello) {super();}
	public VeicoloStandardEuropeo(int assi,float altezza,int anno,String modello,String marca) {super();}
	public classeAmbienteTipo getClasseambientale() {return classeambientale;}
	public void setClasseambientale(classeAmbienteTipo classeambientale) {;}
}
