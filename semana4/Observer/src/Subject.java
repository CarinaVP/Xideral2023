public interface Subject{
	//Los objetos usan la interfaz para registrarse como observadores
	//y también para eliminarlos
	//LOS 3 MÉTODOS USADOS SON:
		public void registerObserver( Observer observer );

		public void removeObserver( Observer observer );
        //actualizar todos los observadores actuales cuando cambia su estado
		public void notifyObservers();
}
