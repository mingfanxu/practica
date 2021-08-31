package practica2;

import java.util.Scanner;

public class student {
	public static Scanner scanner = new Scanner(System.in);
    //    clase
    private String grade;
    //    matricula
    private long id;
    //    nombre
    private String name;
    
    public student() {
    }
    
    public student(String grade, long id, String name) {
        this.grade = grade;
        this.id = id;
        this.name = name;
    }
    
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isValid(ArrayList<student> students, long id) {
        for (student student : students) {
            if (student.getId() == id) {
                return true;
            }
        }
        return false;
    }
    
    public void showAvg(ArrayList<student> students) {
        System.out.println("----------Exportar estadísticas de estudiantes----------");
        if (students.size() == 0) {
            System.out.println("Actualmente no hay datos, por favor agregue los datos primero.");
        } else {
            System.out.println("Clase \\ t \\ tID de estudiante \\ t \\ tNombre");
            System.out.println("---------------------------------");
            for (student student : students) {
                System.out.format("%s\t\t%d\t\t%s\n", student.getGrade(), student.getId(), student.getName());
            }
        }
    }
    
    public void lookupStudent(ArrayList<student> students) {
        System.out.println("----------Encuentra las calificaciones de los estudiantes----------");
        if (students.size() == 0) {
            System.out.println("Actualmente no hay datos, agrégalos e inténtalo de nuevo.");
        } else {
            System.out.println("Ingrese la identificación de estudiante del estudiante que desea encontrar：");
            long id = scanner.nextLong();
            int flag = -1;
            Student student = new Student();
            //Encuentre el número de estudiante correspondiente y salga cuando lo encuentre
            for (int i = 0; i < students.size(); i++) {
                student = students.get(i);
                if (student.getId() == id) {
                    flag = i;
                    break;
                }
            }

            if (flag == -1) {
                System.out.println("No se encuentra el estudiante con la identificación de estudiante correspondiente, ¡confirme y vuelva a ingresar!");
            } else {
                System.out.println("Los puntajes de los estudiantes correspondientes al número de estudiantes son los siguientes：");
                System.out.println("Clase \\ t \\ tID de estudiante \\ t \\ tNombre");
                System.out.format("%s\t%d\t\t%s\\n", student.getGrade(), student.getId(), student.getName());
                System.out.println("¡Encuentra información con éxito!");
            }
        }

	
    }
}
