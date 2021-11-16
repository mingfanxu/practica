package practica9;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
	    public static Scanner scanner = new Scanner(System.in);
	    
	    private String grade;
	    
	    private long id;
	    
	    private String name;
	    
	    private float math;
	    
	    private float english;
	    
	    private float sport;
	    
	    private float java;
	    
	    private float cPlusPlus;
	    
	    private float polity;
	    
	    private float algorithm;
	    
	    private double average;

	    public Student() {
	    }

	    public Student(String grade, long id, String name, float math, float english, float sport, float java, float cPlusPlus, float polity, float algorithm, double average) {
	        this.grade = grade;
	        this.id = id;
	        this.name = name;
	        this.math = math;
	        this.english = english;
	        this.sport = sport;
	        this.java = java;
	        this.cPlusPlus = cPlusPlus;
	        this.polity = polity;
	        this.algorithm = algorithm;
	        this.average = average;
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

	    public float getMath() {
	        return math;
	    }

	    public void setMath(float math) {
	        this.math = math;
	    }

	    public float getEnglish() {
	        return english;
	    }

	    public void setEnglish(float english) {
	        this.english = english;
	    }

	    public float getSport() {
	        return sport;
	    }

	    public void setSport(float sport) {
	        this.sport = sport;
	    }

	    public float getJava() {
	        return java;
	    }

	    public void setJava(float java) {
	        this.java = java;
	    }

	    public float getcPlusPlus() {
	        return cPlusPlus;
	    }

	    public void setcPlusPlus(float cPlusPlus) {
	        this.cPlusPlus = cPlusPlus;
	    }

	    public float getPolity() {
	        return polity;
	    }

	    public void setPolity(float polity) {
	        this.polity = polity;
	    }

	    public float getAlgorithm() {
	        return algorithm;
	    }

	    public void setAlgorithm(float algorithm) {
	        this.algorithm = algorithm;
	    }

	    public double getAvg(Student student) {
	        return (student.getAlgorithm() + student.getcPlusPlus() + student.getEnglish() + student.getSport() + student.getJava() + student.getPolity() + student.getMath()) / 7;
	    }

	    public void setAverage(double average) {
	        this.average = average;
	    }


	    public void addScore(ArrayList<Student> students) {
	        System.out.println("----------Datos del alumno----------");
	        System.out.println("Por favor ingrese los siguientes datos a su vezㄩ");
	        long id;
	        while (true) {
	            System.out.println("Matricula");
	            id = scanner.nextInt();
	            if (isValid(students, id)) {
	                System.out.println("Identificaci車n de estudiante duplicada, vuelva a ingresar");
	            } else {
	                break;
	            }
	        }

	        System.out.println("Grade");
	        String grade = scanner.next();
	        System.out.println("Name");
	        String name = scanner.next();
	        System.out.println("Math");
	        float math = scanner.nextFloat();
	        System.out.println("English");
	        float english = scanner.nextFloat();
	        System.out.println("PE");
	        float sport = scanner.nextFloat();
	        System.out.println("Java");
	        float java = scanner.nextFloat();
	        System.out.println("C");
	        float cPlusPlus = scanner.nextFloat();
	        System.out.println("Polity");
	        float polity = scanner.nextFloat();
	        System.out.println("Algorithm");
	        float algorithm = scanner.nextFloat();

	        // Cree un objeto, establezca sus propiedades y luego agr谷guelo a la colecci車n de objetos del estudiante
	        Student student = new Student();
	        student.setId(id);
	        student.setGrade(grade);
	        student.setName(name);
	        student.setMath(math);
	        student.setAlgorithm(algorithm);
	        student.setEnglish(english);
	        student.setcPlusPlus(cPlusPlus);
	        student.setJava(java);
	        student.setSport(sport);
	        student.setPolity(polity);
	        //        pormedio
	        double avg = getAvg(student);
	        student.setAverage(avg);
	        students.add(student);
	        System.out.println("Agregado exitosamente");
	    }


	    public boolean isValid(ArrayList<Student> students, long id) {
	        for (Student student : students) {
	            if (student.getId() == id) {
	                return true;
	            }
	        }
	        return false;
	    }


	    public void showAvg(ArrayList<Student> students) {
	        System.out.println("----------Exportar estad赤sticas de estudiantes----------");
	        if (students.size() == 0) {
	            System.out.println("Actualmente no hay datos, primero agregue los datos");
	        } else {
	            System.out.println("Grade\t\tmatricula\t\tname\t\tpormedio");
	            System.out.println("---------------------------------");
	            for (Student student : students) {
	                System.out.format("%s\t\t%d\t\t%s\t\t%.2f\n", student.getGrade(), student.getId(), student.getName(), student.getAvg(student));
	            }
	        }
	    }


	    public void lookupStudent(ArrayList<Student> students) {
	        System.out.println("----------Encuentra las calificaciones de estudiantes----------");
	        if (students.size() == 0) {
	            System.out.println("Actualmente no hay datos, agregue e intente nuevamente");
	        } else {
	            System.out.println("Ingresar matriculaㄩ");
	            long id = scanner.nextLong();
	            int flag = -1;
	            Student student = new Student();
	            for (int i = 0; i < students.size(); i++) {
	                student = students.get(i);
	                if (student.getId() == id) {
	                    flag = i;
	                    break;
	                }
	            }

	            if (flag == -1) {
	                System.out.println("No se encuentra el estudiante con la identificaci車n de estudiante correspondiente, por favor confirme y vuelva a ingresar");
	            } else {
	                System.out.println("Calificacionesㄩ");
	                System.out.println("Grade\t\tMatricula\t\tName\t\tMath\t\tEnglish\t\tPE\t\tJava\tPolity\tC\t\t\t\t\tAlgorithm\tpormedio");
	                System.out.format("%s\t%d\t\t%s\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", student.getGrade(), student.getId(), student.getName(), student.getMath(), student.getEnglish(), student.getSport(), student.getJava(), student.getcPlusPlus(), student.getPolity(), student.getAlgorithm(), student.getAvg(student));
	                System.out.println("Encuentra informaci車n 谷xito");
	            }
	        }

	    }


	    public void modifyStudent(ArrayList<Student> students) {
	        System.out.println("----------Modificar las calificaciones de los estudiantes----------");
	        if (students.isEmpty()) {
	            System.out.println("No hay datos");
	        } else {
	            System.out.println("Ingresar matriculasㄩ");
	            long id = scanner.nextLong();

	            for (Student student : students) {
	                if (id == student.getId()) {
	                    System.out.println("Ingresar calificaciones");
	                    System.out.println("Math");
	                    float math = scanner.nextFloat();
	                    System.out.println("English");
	                    float english = scanner.nextFloat();
	                    System.out.println("PE");
	                    float sport = scanner.nextFloat();
	                    System.out.println("Java");
	                    float java = scanner.nextFloat();
	                    System.out.println("C");
	                    float cPlusPlus = scanner.nextFloat();
	                    System.out.println("Polity");
	                    float polity = scanner.nextFloat();
	                    System.out.println("Algorithm");
	                    float algorithm = scanner.nextFloat();

	                    student.setMath(math);
	                    student.setAlgorithm(algorithm);
	                    student.setEnglish(english);
	                    student.setcPlusPlus(cPlusPlus);
	                    student.setJava(java);
	                    student.setSport(sport);
	                    student.setPolity(polity);
	                    //                pormedio
	                    double avg = getAvg(student);
	                    student.setAverage(avg);
	                    System.out.println("Modificado con 谷xito");
	                } else {
	                    System.out.println("NO BUEQUE MATRICULA,INGRESA OTRAVEZ");
	                }
	                break;
	            }
	        }
	    }


	    public void deleteStudent(ArrayList<Student> students) {
	        System.out.println("----------Eliminar calificaciones del alumno----------");
	        if (students.isEmpty()) {
	            System.out.println("No hay datos");
	        } else {
	            System.out.println("Ingresar matricula para eliminar");
	            long id = scanner.nextLong();

	            int index = -1;
	            for (int i = 0; i < students.size(); i++) {
	                Student student = students.get(i);
	                if (student.getId() == id) {
	                    index = i;
	                    break;
	                }
	            }
	            if (index == -1) {
	                System.out.println("No existe matricula, ingresar otra vez");
	            } else {
	                students.remove(index);
	                System.out.println("----------ELiminando----------");
	            }
	        }
	    }


	    public void showAllStudent(ArrayList<Student> students) {
	        if (students.isEmpty()) {
	            System.out.println("No hay datos");
	        } else {
	            System.out.println("----------Calificaciones----------");
	            System.out.println("Grade\t\tmatricula\t\tname\t\tmath\t\tEnglish\t\tPE\t\tJava\t\tC++\t\tpolity\t\tAlgorithm\t\tpormedio");
	            for (Student student : students) {
	                System.out.format("%s\t%d\t%s\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", student.getGrade(), student.getId(), student.getName(), student.getMath(), student.getEnglish(), student.getSport(), student.getJava(), student.getcPlusPlus(), student.getPolity(), student.getAlgorithm(), student.getAvg(student));
	            }
	        }
	    }


	    public void sortStudent(ArrayList<Student> students) {
	        if (students.isEmpty()) {
	            System.out.println("No hay datos");
	        } else {
	            for (int i = 0; i < students.size() - 1; i++) {
	                if (students.get(i).getAvg(students.get(i)) < students.get(i + 1).getAvg(students.get(i + 1))) {
	                    Student tmp = students.get(i);
	                    students.set(i, students.get(i + 1));
	                    students.set(i + 1, tmp);
	                }
	            }

	            System.out.println("Calificaciones final");
	            System.out.println("Grade\t\tMatricula\t\tName\t\tMath\t\tEnglish\t\tPE\t\tJava\t\tC\t\tPoloty\t\tAlgorithm\t\tpormedio");
	            for (Student student : students) {
	                System.out.format("%s\t%d\t%s\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", student.getGrade(), student.getId(), student.getName(), student.getMath(), student.getEnglish(), student.getSport(), student.getJava(), student.getcPlusPlus(), student.getPolity(), student.getAlgorithm(), student.getAvg(student));
	            }
	        }
	    }

}








