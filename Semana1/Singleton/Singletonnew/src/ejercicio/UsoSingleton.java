package ejercicio;
// En este problema obtengo una unica instancia de una clase que simula la conexión de base de datos 
//con varios usuarios
//ENTONCES CREAMOS OBJETOS DE UNA CLASE
//CONSECUEMTEMENTE A PARTIR DE LA CLASE SOLAMENTE PODEMOS CREAR UN OBJETO
public class UsoSingleton {

	public static void main(String[] args) {
		//dos variables de tipo conexión
		conexionBaseDatos conx1= conexionBaseDatos.obtenerInstancia();
		conexionBaseDatos conx2= conexionBaseDatos.obtenerInstancia();
		
		System.out.println("");
 
		System.out.println(conx1.obtenerNumeroPersona());
		System.out.println(conx2.obtenerNumeroPersona());
		
		System.out.println(conx1);//apunta a la misma posición de memoria que conx2
		System.out.println(conx2);//apunta a la misma posición de memoria que conx1
	}
}
class conexionBaseDatos{
	private static conexionBaseDatos instancia; //unica instancia de la clase
	//privado el constructor
	private conexionBaseDatos() {
		//operaciones relevantes para la conexión con BD
	}
	static {
		instancia=new conexionBaseDatos();
	}
	//static porque no vamos a necesitar de un objeto con conexion a BD para acceder
	public static conexionBaseDatos obtenerInstancia() {
		return instancia;
	}
	//método que retorna un entero
	public int obtenerNumeroPersona() { //personas que están registradas en la BD
		//simulamos 11 registros
		return 11;
	}
}
