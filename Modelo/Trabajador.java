package Modelo;

import Datos.*;

public class Trabajador extends Persona implements IArchivo {

	private string isapre;
	private string afp;

	public Trabajador() {
		// TODO - implement Trabajador.Trabajador
		throw new UnsupportedOperationException();
	}

	public string getIsapre() {
		return this.isapre;
	}

	/**
	 * 
	 * @param isapre
	 */
	public void setIsapre(string isapre) {
		this.isapre = isapre;
	}

	public string getAfp() {
		return this.afp;
	}

	/**
	 * 
	 * @param afp
	 */
	public void setAfp(string afp) {
		this.afp = afp;
	}

}