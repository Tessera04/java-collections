package ar.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import Model.Curso;

public class Clase9 {
	
	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
		{
			add(new LinkedList<>());
			add(new ArrayList<>());
		}
	};
	
	public static void main(String[] args) {
			
		Curso Curso1 = new Curso("Historia", 30);
		Curso Curso2 = new Curso("Algebra", 10);
		Curso Curso3 = new Curso("Ciencias", 20);
		Curso Curso4 = new Curso("Matematica", 40);
		Curso Curso5 = new Curso("Aritmetica", 50);
			
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(Curso1);
		cursos.add(Curso2);
		cursos.add(Curso3);
		cursos.add(Curso4);
		cursos.add(Curso5);
			
		System.out.println(cursos);
		
		//==============================================
		
		Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
		
		//FORMAS DE SUMAR PARA VER LA VARIABLE TIEMPO
		int tiempo = 0;
		for(Curso curso: cursos) {
			tiempo += curso.getTiempo();
		}
		
		System.out.println(tiempo);
		
		//FORMA NRO 2 (MAS SIMPLE)
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
		
		//======================================================
		
		//FORMA DE VER EL MAYOR TIEMPO DE TODOS LOS ITEMS
		int mayor = 0;
		for(Curso curso: cursos) {
			if(curso.getTiempo() > mayor) {
				mayor = curso.getTiempo();
			}
		}
		
		System.out.println(mayor);
		
		//FORMA NRO 2 (MAS SIMPLE)
		
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
		
		//======================================================
		
		//RESTAMOS CIENCIAS DE LA SUMA DEL TOTAL DE TIEMPO
		
		int suma = 0;
		for(Curso curso: cursos) {
			if(!curso.getNombre().equalsIgnoreCase("Ciencias")) {
				suma += curso.getTiempo();
			}
		}
		
		System.out.println(suma);
		
		//FORMA NRO 2 MAS SIMPLE
		
		System.out.println(cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ciencias")).mapToInt(Curso::getTiempo).sum()); 
	}
}
