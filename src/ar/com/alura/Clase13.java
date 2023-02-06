package ar.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Clase13 {
	
		//TODO:
		//TODO:
	
		public static void main(String[] args) {
			
			String alumno1 = "Matias Gonzalez";
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
			
			//MUESTRA LISTA DE ITEMS
			
			listaAlumnos.forEach(alumno -> {
				System.out.println(alumno);
			});
			
			//VALIDADOR DE NOMBRES/CREDENCIALES
			//(DEBE COLOCARSE TAL Y COMO SE PUSO)
			
			boolean valida = listaAlumnos.contains("Eluney");
			
			System.out.println(valida);
			
			//MUESTRA EL ITEM DE CARACTERES MAS LARGOS
			String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
			
			System.out.println(max);
			
			//REMOVEDOR DE ITEMS CON MISMOS CARACTERES
			
			listaAlumnos.removeIf(alumno -> "Gladys".equalsIgnoreCase(alumno));
			
			listaAlumnos.forEach(alumno -> {
				System.out.println(alumno);
			});
		}
		
}
