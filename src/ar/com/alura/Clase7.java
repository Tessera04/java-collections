package ar.com.alura;

import java.util.ArrayList;
import java.util.List;

import Model.Aula;
import Model.Curso;

public class Clase7 {
	public static void main(String[] args) {
		
		Curso Curso1 = new Curso("Java", 30);
		Curso1.addAula(new Aula("ArrayList"));
		Curso1.addAula(new Aula("List"));
		Curso1.addAula(new Aula("LinkedList"));
		Curso1.addAula(new Aula("Inmutable"));
		
		List<Aula> aulaList = Curso1.getAulaList();
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(Curso1);
		
		System.out.println(aulaList);
	}
}
