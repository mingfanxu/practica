package practica7;

public class Mini_Robot extends Robot implements Acciones{
	public boolean accionrealizada = false;
	public boolean accionEspecial;
	public Mini_Robot(){
		super();
		System.out.println("Terminando de configurar Mini Robot Dos Cuchillos");
	}

	public String CortarCarne(){
		accionrealizada = true;
		return ("Soy Mini Robot " + nombre + " y se cortar carne");
	}

	public String PicarVerdura(){
		accionrealizada = true;
		return ("Soy Mini Robot " + nombre + " y se picar verduras");
	}

	public String CocinarGuiso(){
		accionrealizada = true;
		return ("Soy Mini Robot " + nombre +" y trate de cocinar");
	}

	public String Servir(){
		accionrealizada = true;
		return ("Soy Mini Robot " + nombre +" y trate de servir la comida");
	}


}
