package Autostrada;

public class Casello {
	private int chilometro;//relativo all'autostrada
	private String nome;//nome del casello
	public Casello(int km,String nome) {;}
	/**getters e setters**/
	public int getChilometro() {return 0;}
	@Override
	public String toString() {
		return "Il casello "+nome+" Si trova al chilometro "+chilometro;
	}	
	
}
