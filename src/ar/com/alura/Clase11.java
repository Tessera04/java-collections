package ar.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Clase11 {
	
		//TODO:
		//TODO:
	
		public static void main(String[] args) {
			
			String alumno1 = "Matias";
			String alumno2 = "Eluney";
			String alumno3 = "Franco";
			String alumno4 = "Mario";
			String alumno5 = "Ana";
			String alumno6 = "Gladys";
			
			Set<String> listaAlumnos = new HashSet<>();
			
			listaAlumnos.add(alumno1);
			listaAlumnos.add(alumno2);
			listaAlumnos.add(alumno3);
			listaAlumnos.add(alumno4);
			listaAlumnos.add(alumno5);
			listaAlumnos.add(alumno6);
			
			for (String alumno: listaAlumnos) {
				System.out.println(alumno);
			}
		}
		
}
