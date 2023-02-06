package ar.com.alura;

import java.util.ArrayList;

import Model.Clase;
import Model.Curso;

public class Clase6 {
	public static void main(String[] args) {
		
		Curso Curso1 = new Curso("Java", 30, new ArrayList<>());
		Curso1.addClase(new Clase("ArrayList"));
		Curso1.addClase(new Clase("List"));
		Curso1.addClase(new Clase("LinkedList"));
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(Curso1);
		
		System.out.println(cursos.get(0).getClaseList());
	}
}
