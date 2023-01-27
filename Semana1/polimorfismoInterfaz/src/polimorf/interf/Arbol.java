package polimorf.interf;

//hereda de Especie
public class Arbol implements Especie {
	//aquí se declaran los atributos
	 String nombre;
	 String tallo;
	 int altura;
	 String rama;
	
	//se genera el constructor
	public Arbol(String nombre, String tallo, int altura, String rama) {
		super();
		this.nombre = nombre;
		this.tallo = tallo;
		this.altura = altura;
		this.rama = rama;
	}
	
	@Override
	public int ejecuta() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Árbol: "+ nombre + ","+ "con tallo: "+ tallo + ", altura: "+ altura+ ","+ " y medida de la rama: "+rama;
	}



	

}
