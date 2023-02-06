package ar.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Clase12 {
	
		//TODO:
		//TODO:
	
		public static void main(String[] args) {
			
			String alumno1 = "Matias";
			String alumno2 = "Eluney";
			String alumno3 = "Franco";
			String alumno4 = "Mario";
			String alumno5 = "Ana";
			String alumno6 = "Gladys";
			String alumno7 = "Ana";
			String alumno8 = "Gladys";
			
			//HASHSET<>() NO REPITE VALORES
			//ARRAYLIST<>() SI LOS REPITE
			Collection<String> listaAlumnos = new HashSet<>();
			//Collection<String> listaAlumnos = new ArrayList<>();
			
			listaAlumnos.add(alumno1);
			listaAlumnos.add(alumno2);
			listaAlumnos.add(alumno3);
			listaAlumnos.add(alumno4);
			listaAlumnos.add(alumno5);
			listaAlumnos.add(alumno6);
			listaAlumnos.add(alumno7);
			listaAlumnos.add(alumno8);
			
			for (String alumno: listaAlumnos) {
				System.out.println(alumno);
			}
			
			//listaAlumnos.forEach(alumno -> {
			//	System.out.println(alumno);
			//});
		}
		
}
