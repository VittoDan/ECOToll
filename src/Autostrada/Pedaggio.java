package Autostrada;

import Veicolo.Veicolo;

public class Pedaggio {
	private float tariffaUnitaria;
	private boolean arrotondamento;
	
	public Pedaggio() {;}
	public Pedaggio(float tariffaU) {;}
	public Pedaggio(float tariffaU,float arrotond) {;}
	public Pedaggio(float tariffaU,float arrotond,Veicolo v) {;}
	public float getTariffaUnitaria() {return 0;}
	public void setTariffaUnitaria(float tariffaUnitaria) {;}
	public boolean getArrotondamento() {return false;}
	public void setArrotondamento(float arrotondamento) {;}
	public int getClasseVeicolo() {return 0;}
	public void setClasseVeicolo(int classeVeicolo) {;}
}
