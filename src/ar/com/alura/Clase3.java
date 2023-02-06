package ar.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {
	public static void main(String[] args) {
		
		String Curso1 = "Geometria";
		String Curso2 = "Fisica";
		String Curso3 = "Historia";
		String Curso4 = "Ingles";
		String Curso5 = "=======";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(Curso1);
		cursos.add(Curso2);
		cursos.add(Curso3);
		cursos.add(Curso4);
		cursos.add(Curso5);
		
		System.out.println(cursos);
		
		//ORDEN MENOR A MAYOR
		Collections.sort(cursos);
		
		System.out.println(cursos);
		
		//ORDEN MAYOR A MENOR
		Collections.sort(cursos, Collections.reverseOrder());
		
		System.out.println(cursos);
		
		//Option 2
		
		//ORDEN MENOR A MAYOR
		cursos.sort(Comparator.reverseOrder());
		
		System.out.println(cursos);
		
		//ORDEN MAYOR A MENOR
		cursos.sort(Comparator.reverseOrder());
		
		System.out.println(cursos);
		
		//Option 3
		
		//ORDEN MENOR A MAYOR
		
		List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());
		
		System.out.println(cursosList);
		
	}
}
