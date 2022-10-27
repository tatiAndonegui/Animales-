package clase18;

public class Main {

	public static void main(String[] args) {
		
		Animal  nina  = new Gato ("nina", "naranja",1, "marrones");
		nina.hacerSonido();
		nina.Moverse();
		
		Perro tobby = new Perro ("tobby", "marron", 3, "grande");
		tobby.hacerSonido();
		tobby.Moverse();
		
		Caballo pegazo = new Caballo ("pegazo", "blanco", 15, "chica");
		pegazo.hacerSonido();
		pegazo.Moverse();
		
		Serpiente nagiri = new Serpiente ("nagiri", "verde",6, " ta potente"); 
		nagiri.hacerSonido();
		nagiri.Moverse();

	}

}
