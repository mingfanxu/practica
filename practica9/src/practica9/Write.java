package practica9;

import java.io.*;

public class Write {
	public void WriteFile(Alumno alu[]){
		try{
		ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("CalifiAlumno.bin"));
		for(int i = 0; i<alu.length; i++){
			s.writeObject(alu[i]);
		}
		s.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("The file has been generated successfully");
		}


}
