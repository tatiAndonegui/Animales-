package clase18;

public abstract class Animal {

	private String nombre;
	private String color;
	private int edad;
	
	public Animal(String nombre, String color, int edad) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.edad = edad;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	} 
	
	public void hacerSonido( ) {
			System.out.println ("nada");
		
	}
	
	public void Moverse () {
		System.out.println("aca caminando");
	}
}
