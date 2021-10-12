package practica6;

import java.util.Random;


public class Equipo {
	String nameEquipo;
	int division;
	String entrenador;
	int torneosTotales;
	int torneosGanados;
	int torneosPerdidos;
	Jugador[] jugadores = new Jugador[10];
	
	public void setNameEquipo(String nombre){
		nameEquipo = nombre;
		}
		public void setDivision(int division){
		this.division = division;
		}
		public void setEntrenador(String entrenador){
		this.entrenador = entrenador;
		}
		public void setTorneosTotales(int torneosT){
		torneosTotales = torneosT;
		}
		public void setTorenosGanados(int torneosG){
		torneosGanados = torneosG;
		}
		public void setTorneosPerdidos(int torneosP){
		torneosPerdidos = torneosP;
		}
		
		public void setJugadores(int numEquipo){
			System.out.println("Capturando jugadores del equipo " +(numEquipo+1));
			Random r = new Random();
			for(int i=0;i<jugadores.length;i++){
				jugadores[i] = new Jugador();
			}
			for(int i=0;i<jugadores.length;i++){
				jugadores[i].setNombre(CapturaEntrada.capturarCadena("Nombre")
			);
			
			if(numEquipo!=0){
				for(int j=0;j<numEquipo;j++){
					for(int k=0;k<jugadores.length;k++){
						while(jugadores[i].getNombreJugador().equals(Torneo.equipos[j].jugadores[k].getNombreJugador())){
							jugadores[i].setNombre(CapturaEntrada.capturarCadena("Otro nombre"));
							}
						}
					}
				}
			jugadores[i].setNumJugador(CapturaEntrada.capturarEntero("Numero del jugador"));
			
			for(int z=0;z<i;z++){
				while(jugadores[i].getNumJugador() == jugadores[z].getNumJugador()){
					jugadores[i].setNumJugador(CapturaEntrada.capturarEntero("Otro numero del jugador"));
					}
				}
			if(i<=5){
				jugadores[i].setPosicion("Delantero");
				}
			else{
				jugadores[i].setPosicion("Defensa");
				}
			jugadores[i].setEstatura(r.nextInt(200-170)+170);
			jugadores[i].setpuntosAnotados(r.nextInt(50));
			}
			}
		public String getNameEquipo(){
			    return nameEquipo;
			}
		
			public int getDivision(){
				return division;
			}
			
			public int puntosTotales(){
				int puntosT = 0;
			for(Jugador j: jugadores){
				puntosT+= j.getPuntosAnotados();
				}
			return puntosT;
			}
			
			public int jugadoresTotales(){
				return jugadores.length;
				}



}
