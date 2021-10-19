package practica7;

public class Mini_Robot3 extends Robot implements Acciones{
	public boolean accionrealizada = false;
	public boolean accionEspecial;
	public Mini_Robot3(){
	super();
	System.out.println("Terminando de configurar Mini Robot Manos Calientes");
	}

	public String CortarCarne(){
		accionrealizada = true;
		return ("Soy Mini Robot " + nombre + " y trate de cortar carne");
	}

	public String PicarVerdura(){
		accionrealizada = true;
		return ("Soy Mini Robot " + nombre + " y trate de picar verduras");
	}

	public String CocinarGuiso(){
		accionrealizada = true;
		return ("Soy Mini Robot " + nombre +" y se cocinar");
	}

	public String Servir(){
		accionrealizada = true;
		return ("Soy Mini Robot " + nombre +" y trate de servir la comida");
	}


}
