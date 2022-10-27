package clase18;

public class Perro extends Animal {

	private String hocico;

	public Perro(String nombre, String color, int edad, String hocico) {
		super(nombre, color, edad);
		this.hocico = hocico;
	}

	public String getHocico() {
		return hocico;
	}

	public void setHocico(String hocico) {
		this.hocico = hocico;
	}

	@Override
	public String toString() {
		return "Perro [hocico=" + hocico + "]";
	}

	public void hacerSonido( ) {
		System.out.println ("woof");
	}
	
}
