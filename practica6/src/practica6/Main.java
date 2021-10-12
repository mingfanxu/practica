package practica6;

public class Main {
	public static void main(String[] args) {
		Torneo torn = new Torneo();
		System.out.println("Nombre del torneo: " +torn.getNombretorneo() +"\nRegion: " + torn.getRegion());
		System.out.println("Equipos particiapantes: " + torn.getNumeroEquipos());
		System.out.println("Partidos jugados: " +torn.getPartidosJugados()+ "\nPartido pendientes:"+torn.getPartidosPendientes());
		for(int i=0;i<Torneo.equipos.length;i++){
			System.out.println("Nombre del equipo :"+Torneo.equipos[i].getNameEquipo());
			System.out.println("Division "+ Torneo.equipos[i].getDivision());
			System.out.println("Cantidad de jugadores " + Torneo.equipos[i].jugadoresTotales());
			System.out.println("Puntos obtenidos: " + Torneo.equipos[i].puntosTotales());
			
			for(int j=0;j<Torneo.equipos[i].jugadores.length;j++){
				System.out.println("Jugador: " + Torneo.equipos[i].jugadores[j].getNombreJugador());
				System.out.println("Numero del jugador: " + Torneo.equipos[i].jugadores[j].getNumJugador());
				}
			} 
		}

}
