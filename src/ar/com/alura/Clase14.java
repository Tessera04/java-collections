package ar.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import Model.Alumno;

public class Clase14 {
	
		//TODO:
		//TODO:
	
		public static void main(String[] args) {
			
			Alumno alumno1 = new Alumno("Matias Gonzalez", "001");
			Alumno alumno2 = new Alumno("Eluney", "002");
			Alumno alumno3 = new Alumno("Franco", "003");
			Alumno alumno4 = new Alumno("Mario", "004");
			Alumno alumno5 = new Alumno("Ana", "005");
			Alumno alumno6 = new Alumno("Gladys", "006");
			Alumno alumno7 = new Alumno("Olivia", "007");

			//Collection<Alumno> listaAlumnos = new HashSet<>();
			Collection<Alumno> listaAlumnos = new ArrayList<>();
			
			listaAlumnos.add(alumno1);
			listaAlumnos.add(alumno2);
			listaAlumnos.add(alumno3);
			listaAlumnos.add(alumno4);
			listaAlumnos.add(alumno5);
			listaAlumnos.add(alumno6);
			listaAlumnos.add(alumno7);
			
			Alumno alumnoNuevo = new Alumno("Matias Gonzalez", "001");

			System.out.println(alumno1.equals(alumnoNuevo));
			System.out.println(listaAlumnos.contains(alumnoNuevo));
			
			
		}
		
}
