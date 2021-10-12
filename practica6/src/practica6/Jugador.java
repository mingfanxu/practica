package practica6;

public class Jugador {
	int NumJugador;
	String nombre;
	int puntosAnotados;
	String posicion;
	double estatura;
	public void setNumJugador(int num){
	NumJugador = num;
	}
	public void setNombre(String nomb){
	nombre = nomb;
	}
	public void setpuntosAnotados(int puntos){
	puntosAnotados = puntos;
	}
	public void setPosicion(String pos){
	posicion = pos;
	}
	public void setEstatura(double estatura){
	this.estatura = estatura;
	}
	public int getNumJugador(){
	return NumJugador;
	}
	public String getNombreJugador(){
	return nombre;
	}
	public int getPuntosAnotados(){
	return puntosAnotados;
	}


}
