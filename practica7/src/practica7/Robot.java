package practica7;

public abstract class Robot {
	private int bateria;
	public String nombre;
	public int id;
	private String accion;
	public Robot(){
	System.out.println("Configurando... ");
	setNombre(CapturaEntrada.capturaCadena("Nombre del robot"));
	setBateria(CapturaEntrada.capturaEntero("Nivel de bateria"));
	setIdenti(CapturaEntrada.capturaEntero("Num de identificacion"));
	}
	
	public void setBateria(int nivel){
		bateria = nivel;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setIdenti(int id){
		this.id = id;
	}
	
	public void setAccion(String acion){
		accion = acion;
	}
	
	public int getBateria(){
		return bateria;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getId(){
		return id;
	}
	
	public String getAccion(){
		return accion;
	}
	
	public void Imprimir(){
		System.out.println("Num de identificacion de " + nombre + id);
		System.out.println("Nivel de bateria: " + bateria);
		System.out.println("Ultima accion hecha: " + accion);
	}


}
