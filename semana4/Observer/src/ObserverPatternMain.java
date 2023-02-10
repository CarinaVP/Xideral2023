import java.util.ArrayList;
import java.util.Iterator;

public class ObserverPatternMain{
	//ABSORVE LOS REGISTROS DEL PRODUCTO
	//SE VEN LOS REGISTROS DE LA SOLICITUD

		public static void main( String[] args )
		{
				Product samsungLEDTV = new Product("Samsung LED TV", "LED TV","60000Rs", "No disponible");
				
				//Se creará el objeto persona david y el objeto persona david se registrará en el sujeto
				Person david = new Person("David",samsungLEDTV);
				//Se creará el objeto persona JOHN y el objeto persona Juan se registrará en el sujeto
				Person john = new Person("John",samsungLEDTV);
				Person peter = new Person("peter",samsungLEDTV);

				ArrayList<Observer> subscribers= samsungLEDTV.getObservers();
				System.out.println("Lista de suscriptores : "+ subscribers);
				for( Iterator<Observer> iterator = subscribers.iterator(); iterator.hasNext(); )
                {
		                Person person = (Person) iterator.next();
		                System.out.println("Esta persona se ha suscrito : " + person.getPersonName());		                
                }
				System.out.println();
				System.out.println("Estado actual de la TV LED Samsung : "+samsungLEDTV.getAvailability());
				System.out.println();
				// Now product is available
				samsungLEDTV.setAvailability("Disponible");
		}

}
