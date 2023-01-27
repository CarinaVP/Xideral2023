package polimorf.clasAbs;

public class Hierba extends Especie{

	public Hierba(String nombre, String tallo, int altura, String rama) {
		super(nombre, tallo, altura, rama);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hierba: "+ nombre + ","+ "con tallo: "+ tallo + ", altura: "+ altura+ ","+ " y medida de la rama: "+rama;
	}


}
