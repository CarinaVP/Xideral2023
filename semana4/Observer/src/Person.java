public class Person implements Observer
{
		private String personName;

		public Person( String personName, Subject subject )
		{
				this.personName = personName;
				subject.registerObserver(this);
		}

		public String getPersonName()
		{
				return personName;
		}

		public void setPersonName( String personName )
		{
				this.personName = personName;
		}

		public void update( String availabiliy )
		{
				System.out.println("Hola " + personName + ", El producto es ahora " + availabiliy + " en SAMS");
		}
}
