package practica9;

public class Main {
	public static void main(String[] args) {
		Alumno alu[] = new Alumno[3];
		CSVReader LA = new CSVReader();
		Write EA = new Write();
		LA.ReaderCSV();
		int z = 0;
		for(int i = 0; i<alu.length;i++){
			alu[i] = new Alumno();
		for(int j = 0; j< alu[0].calificaciones.length ; j++){ 
			alu[i].calificaciones[j] = LA.calificaciones[z]; z++;
		}
		alu[i].CalProm();
		}
		for (Alumno alumno : alu) {
			alumno.ImprimirAlumno();
		}
		EA.WriteFile(alu);
		}


}
