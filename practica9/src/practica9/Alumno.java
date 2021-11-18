package practica9;

import java.io.Serializable;

public class Alumno  implements Serializable{
	private String nombre;
	private String matri;
	float prom;
	float calificaciones[] = new float[7];
	
	public Alumno(){
		setNombre(CapturaEntrada.capturaCadena("Nombre del alumno"));
		setMatri(CapturaEntrada.capturaCadena("Matricula"));
		}
		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		
		public void setMatri(String mat){
			matri = mat;
		}
		public String getNombre(){
			return nombre;
		}
		public String getMatri(){
			return matri;
		}
		public void CalProm(){
			prom = 0;
			for(int i = 0;i<calificaciones.length;i++){
				prom+=calificaciones[i];
		}
		prom/=calificaciones.length;
		}
		
		public void ImprimirAlumno(){
			System.out.println("Nombre de alumno: " + nombre);
			System.out.println("Matricula: " + matri);
			System.out.println("Calificaciones: ");
			for(int i=0;i<calificaciones.length;i++){
				System.out.println(calificaciones[i]);
		}
		System.out.println("Promedio final: " + prom);
		}


}
