package polimorf.clasAbs;

public class Arbusto extends Especie {

	public Arbusto(String nombre, String tallo, int altura, String rama) {
		super(nombre, tallo, altura, rama);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Árbusto: "+ nombre + ","+ "con tallo: "+ tallo + ", altura: "+ altura+ ","+ " y medida de la rama: "+rama;
	}


}
