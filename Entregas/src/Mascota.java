public class Mascota {

	private String nombreMascota;
	private Persona dueño;

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombre) {
		nombreMascota = nombre;
	}

	public Persona getDueño() {
		return dueño;
	}

	public void setDueño(Persona nombreDueño) {
		dueño = nombreDueño;
	}

	public Mascota(String nombre, Persona nombreDueño) {
		nombreMascota = nombre;
		dueño = nombreDueño;
	}

}