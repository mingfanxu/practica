package practica9;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("----------WEILCOME-----------");
            System.out.println("-------------��1��Ingresal calificaciones del alumo-------------");
            System.out.println("-------------��2��Datos-------------");
            System.out.println("-------------��3��Calificaciones del alumo-------------");
            System.out.println("-------------��4��Cambiar calificacion-------------");
            System.out.println("-------------��5��Eliminar calificaciones del alumno-------------");
            System.out.println("-------------��6��Pormedio-------------");
            System.out.println("-------------��7��Calificaciones final-------------");
            System.out.println("-------------��0��Salir-------------");
            Student student = new Student();

            System.out.println("iNGRESAR NUMERO ��0-7��");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    
                    student.addScore(students);
                    break;
                case "2":
                    
                    student.showAvg(students);
                    break;
                case "3":
                    
                    student.lookupStudent(students);
                    break;
                case "4":
                    
                    student.modifyStudent(students);
                    break;
                case "5":
                    
                    student.deleteStudent(students);
                    break;
                case "6":
                    
                    student.sortStudent(students);
                    break;
                case "7":
                    
                    student.showAllStudent(students);
                    break;
                case "0":
                    System.exit(0);
                default:
                    break;
            }
       }
}





}
