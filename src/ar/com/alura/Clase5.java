package ar.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Model.Curso;

public class Clase5 {
	public static void main(String[] args) {
		
		Curso Curso1 = new Curso("Java", 30);
		Curso Curso2 = new Curso("HTML", 10);
		Curso Curso3 = new Curso("CSS", 20);
		Curso Curso4 = new Curso("Python", 40);
		Curso Curso5 = new Curso("Javascript", 50);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(Curso1);
		cursos.add(Curso2);
		cursos.add(Curso3);
		cursos.add(Curso4);
		cursos.add(Curso5);
		
		System.out.println(cursos);
		
		//================================
		
		Collections.sort(cursos, Collections.reverseOrder());
		
		System.out.println(cursos);
		
		Collections.sort(cursos);
		
		System.out.println(cursos);
		//================================
		//METODO SIN EL COMPARE.TO DE CURSO
		cursos.sort(Comparator.comparing(Curso::getNombre));
		
		System.out.println(cursos);
		
		//===============================
		//METODO CON COLLECTIONS
		//ORDEN REVERSED
		Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
		
		System.out.println(cursos);
		
		//ORDEN NORMAL
		Collections.sort(cursos, Comparator.comparing(Curso::getNombre));
		
		System.out.println(cursos);
		
		//==============================
		//ORDENANDO POR TIEMPO
		List<Curso> cursoList = cursos.stream().sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
		
		System.out.println(cursoList);
		
		//==============================
		//CREANDO LISTA SIN UN ELEMENTO
		List<Curso> cursoList2 = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("CSS")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
		
		System.out.println(cursoList2);
		//CREANDO UNA LISTA SOLO CON ESE ELEMENTO
		List<Curso> cursoList3 = cursos.stream().filter(curso -> curso.getNombre().equalsIgnoreCase("CSS")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
		
		System.out.println(cursoList3);
	}
}
