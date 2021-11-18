package practica9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CSVReader {
	   public int calificaciones[] = new int[21];
	    public void ReaderCSV(){
	        String line;
	        try{
	            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\mingf\\Desktop\\java\\practica9\\practica9.csv"));
	            try {
	                while((line = reader.readLine())!= null){
	                    String num[] = line.split(",");
	                    
	                    String last = num[num.length-1];
	                    int value = Integer.parseInt(last);
	                    System.out.println(last);
	                    //num[0] = String.valueOf(num[0].charAt(1)) + String.valueOf(num[0].charAt(2)) ;
	                  // for(int i = 0; i<num.length;i++){
	                       // calificaciones[i] = Integer.parseInt(num[i]);
	                   // }
	                }
	            } catch (IOException ex) {
	                System.out.println("No se puede leer el archivo" + ex);
	            }
	        }
	        catch(FileNotFoundException e){
	            System.out.println("No se puede abrir el archivo" + e);
	        }
	    }
}
