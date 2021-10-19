package practica7;

public class Magnum extends Robot implements Acciones{
	public Magnum(){
		super();
		System.out.println("Configuracion terminada de Magnum Opus");
		}

		public String CortarCarne(){
		return ("Soy Magum Opus " + nombre + " y se cortar carne");
		}

		public String PicarVerdura(){
			return ("Soy Magum Opus " + nombre + " y se picar verduras");
		}

		public String CocinarGuiso(){
			return ("Soy Magum Opus " + nombre +" y se cocinar");
		}

		public String Servir(){
			return ("Soy Magum Opus " + nombre +" y se servir la comida");
		}

	

}
