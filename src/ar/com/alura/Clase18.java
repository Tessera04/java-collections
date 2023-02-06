package ar.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

import Model.Alumno;
import Model.Curso;

public class Clase18 {
	
		//TODO:
		//TODO:
	
		public static void main(String[] args) {
			
			Curso curso1 = new Curso("Historia", 30);
			
			Alumno alumno1 = new Alumno("Matias Gonzalez", "001");
			Alumno alumno2 = new Alumno("Eluney", "002");
			Alumno alumno3 = new Alumno("Franco", "003");
			Alumno alumno4 = new Alumno("Mario", "004");
			Alumno alumno5 = new Alumno("Ana", "005");
			Alumno alumno6 = new Alumno("Gladys", "006");
			Alumno alumno7 = new Alumno("Olivia", "007");

			//Collection<Alumno> listaAlumnos = new HashSet<>();
			Collection<Alumno> listaAlumnos = new ArrayList<>();
			
			curso1.addAlumno(alumno1);
			curso1.addAlumno(alumno2);
			curso1.addAlumno(alumno3);
			curso1.addAlumno(alumno4);
			curso1.addAlumno(alumno5);
			curso1.addAlumno(alumno6);
			curso1.addAlumno(alumno7);
			
			//MUESTRA TODOS LOS ALUMNOS
			curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));
			
			//MUESTRA UN CODIGO DE ALUMNO
			Optional<Alumno> alumno = curso1.getAlumnos().stream().filter(a -> "003".equalsIgnoreCase(a.getCodigo())).findFirst();
			
			if(alumno.isPresent()) {
				System.out.println(alumno.get());
			}
			
			Alumno alumnoMap = curso1.getAlumnoMap().get("003");
			System.out.println(alumnoMap);
			
		}
		
}
