package polimorf.clasAbs;

//definimos y modelamos el comportamiento:
public abstract class Especie {
	//atributos:
	String nombre;
	String tallo;
	int altura;
	String rama;
	
	//constructor:
	public Especie(String nombre, String tallo, int altura, String rama) {
		super();
		this.nombre = nombre;
		this.tallo = tallo;
		this.altura = altura;
		this.rama = rama;
	}
	
	//método abstracto

	//abstract String salida();
	
	
	//método
	@Override
	public String toString() {
		return "Especie: "+ nombre+ "," + " tallo: "+ tallo  +","+" su altura es: " +altura+ ","+ "Medida de la rama: " +rama;
		
		
	
	
	}
	
	

}
