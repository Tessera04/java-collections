package ar.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
		Curso Curso6 = new Curso("Quimica", 70);
		Curso Curso7 = new Curso("Biologia", 60);
		Curso Curso8 = new Curso("Quimica", 90);
		Curso Curso9 = new Curso("Biologia", 80);
			
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(Curso1);
		cursos.add(Curso2);
		cursos.add(Curso3);
		cursos.add(Curso4);
		cursos.add(Curso5);
		cursos.add(Curso6);
		cursos.add(Curso7);
		cursos.add(Curso8);
		cursos.add(Curso9);
			
		System.out.println(cursos);
		
		//==============================================
		
		Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
		
		//FORMAS DE SUMAR PARA VER LA VARIABLE TIEMPO
		//FORMA NRO 2 (MAS SIMPLE)
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
		
		//======================================================
		
		//FORMA DE VER EL MAYOR TIEMPO DE TODOS LOS ITEMS
		//FORMA NRO 2 (MAS SIMPLE)
		
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
		
		//======================================================
		
		//RESTAMOS CIENCIAS DE LA SUMA DEL TOTAL DE TIEMPO
		//FORMA NRO 2 MAS SIMPLE
		
		System.out.println(cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ciencias")).mapToInt(Curso::getTiempo).sum());
		
		//======================================================
		
		//PROMEDIO DE NUMEROS

		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
		
		//======================================================
		
		//NUMERO MAXIMO

		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
		
		//======================================================
		
		//NUMERO MINIMO

		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());
		
		//======================================================
		
		//ELIMINA REPETIDOS DE LA CUENTA Y MUESTRA REPETIDOS CON UN CONTADOR
		
		Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
		
		groupCurso.forEach((key, value) -> System.out.println(key + " - " + value.size()));
		
		//======================================================
		
		//PARALLEL STREAM (CUESTION DE TIEMPOS Y RENDIMIENTOS)
		
		System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum()); 
	
	}
}
