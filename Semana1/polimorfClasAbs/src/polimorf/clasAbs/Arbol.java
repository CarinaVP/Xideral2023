package polimorf.clasAbs;

//hereda de Especie
public class Arbol extends Especie {
	
	//constructor
	public Arbol(String nombre, String tallo, int altura, String rama) {
		super(nombre, tallo, altura, rama);
	}

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Árbol: "+ nombre + ","+ "con tallo: "+ tallo + ", altura: "+ altura+ ","+ " y medida de la rama: "+rama;
	}



	

}
