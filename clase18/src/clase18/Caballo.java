package clase18;

public class Caballo extends Animal {
	private String pezunias;

	public Caballo(String nombre, String color, int edad, String pezunias) {
		super(nombre, color, edad);
		this.pezunias = pezunias;
	}

	public String getPezunias() {
		return pezunias;
	}

	public void setPezunias(String pezunias) {
		this.pezunias = pezunias;
	}

	@Override
	public String toString() {
		return "Caballo [pezunias=" + pezunias + "]";
	}
	
	public void hacerSonido() {
		System.out.println("heeeheh");
	}

}
