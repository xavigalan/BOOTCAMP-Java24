
package ejercicios;
import java.util.ArrayList;

public class Printf {

	public static void main(String[] args) {
		// EJ1
		System.out.println("\nEJ1");
		System.out.printf("%s\t\t%s\t%s\n", "NOMBRE", "APELLIDO1", "APELLIDO2");
		
		// EJ2
		System.out.println("\nEJ2");
		System.out.printf("%s\s%s\s%s\n", "NOMBRE", "apellido1", "apellido2");

		// EJ3
		System.out.println("\nEJ3");
		System.out.printf("%s\s%s\s%s\n", "apellido2", "apellido1", "NOMBRE");

		// EJ4
		System.out.println("\nEJ4");
		System.out.printf("\s\s\s\s22");

		// EJ5
		System.out.println("\nEJ5");
        System.out.printf("%010d\n", 22);
        
		// EJ6
		System.out.println("\nEJ6");
        System.out.printf("%010.2f\n", 17.1829327);

        
        // EJ Tabla Printf
		ArrayList<Alumno> AlumnosList = new ArrayList<Alumno>();
		// Añadiendo peliculas al arrayList
		AlumnosList.add(new Alumno("Xavi", "Galán Pérez", "Primero", "2003"));
		AlumnosList.add(new Alumno("Joel", "Galán Pérez", "Primero", "2003"));
		AlumnosList.add(new Alumno("Pedro", "Garcia Jérez", "Segundo", "2002"));

		System.out.printf("%20s%20s%20s%n", "Nombre ", "Apellidos","Curso", "Año");
		System.out.println("\t-----------------------------------------------------------");
		for (Alumno alumno : AlumnosList) {
			System.out.printf("%20s%20s%20s%n", alumno.nombre, alumno.apellidos, alumno.curso, alumno.anyo);
		}

		System.out.printf("%-20s%-20s%-20s%n", "Nombre ", "Director", "Año");
		System.out.println("-----------------------------------------------------------");
		for (Alumno alumno : AlumnosList) {
			System.out.printf("%-20s%-20s%-20s%n", alumno.nombre, alumno.apellidos, alumno.curso, alumno.anyo);
		}
	}

	public static class Alumno {
		String nombre = "";
		String apellidos= "";
		String curso = "";
		String anyo = "";

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApelldios(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}
		
		public String getAnyo() {
			return anyo;
		}

		public void setAnyo(String anyo) {
			this.anyo = anyo;
		}

		public Alumno(String nombre, String apellidos,String curso, String anyo) {
			super();
			this.nombre = nombre;
			this.apellidos= apellidos;
			this.curso = curso;
			this.anyo = anyo;
		}
	}
        
	}

