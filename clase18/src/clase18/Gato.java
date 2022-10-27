package clase18;

public class Gato extends Animal {
	
	private String bigotes;

	public Gato(String nombre, String color, int edad, String bigotes) {
		super(nombre, color, edad);
		this.bigotes = bigotes;
	}

	public String getBigotes() {
		return bigotes;
	}

	public void setBigotes(String bigotes) {
		this.bigotes = bigotes;
	}

	@Override
	public String toString() {
		return "Gato [bigotes=" + bigotes + "]";
	}

	public void hacerSonido( ) {
		System.out.println ("meow");
	}
	
	
}
