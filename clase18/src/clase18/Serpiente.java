package clase18;

public class Serpiente  extends Animal{
	
	private String veneno;

	public Serpiente(String nombre, String color, int edad, String veneno) {
		super(nombre, color, edad);
		this.veneno = veneno;
	}

	public String getVeneno() {
		return veneno;
	}

	public void setVeneno(String veneno) {
		this.veneno = veneno;
	}

	@Override
	public String toString() {
		return "Serpiente [veneno=" + veneno + "]";
	}
	
	public void hacerSonido() {
		System.out.println("sshhhh");
	}
	@Override
	public void Moverse () {
		System.out.println("aca arrastrandome");
	}

	
}
