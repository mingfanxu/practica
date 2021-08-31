package practica2;

public class changegrade {
	
	public void modifyStudent(ArrayList<Student> students) {
        System.out.println("----------Modificar las calificaciones de los estudiantes----------");
        if (students.isEmpty()) {
            System.out.println("Actualmente no hay datos, agr¨¦galos e int¨¦ntalo de nuevo.");
        } else {
            System.out.println("Ingrese la identificaci¨®n de estudiante del estudiante que se va a modificar£º");
            long id = scanner.nextLong();

            for (Student student : students) {
                if (id == student.getId()) {
                    System.out.println("Vuelva a ingresar las calificaciones del estudiante");
                } else {
                    System.out.println("No se encuentra el estudiante con la identificaci¨®n de estudiante correspondiente, por favor confirme y vuelva a ingresar");
                }
                break;
            }
        }
    }

}
