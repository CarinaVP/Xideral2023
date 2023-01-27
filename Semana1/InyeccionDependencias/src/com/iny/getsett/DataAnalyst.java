package com.iny.getsett;

//es interface, entonces implementamos:

public class DataAnalyst implements Puesto {

		private String puesto;
		
		public DataAnalyst(String puesto) {
			this.puesto=puesto;
		
		}
		
		public void elegir() {
			System.out.println("Elige trabajo: "+ puesto);
		}

}
