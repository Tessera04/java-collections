package ar.com.alura;

import java.util.ArrayList;

import Model.Aula;
import Model.Curso;

public class Clase6 {
	public static void main(String[] args) {
		
		Curso Curso1 = new Curso("Java", 30, new ArrayList<>());
		Curso1.addAula(new Aula("ArrayList"));
		Curso1.addAula(new Aula("List"));
		Curso1.addAula(new Aula("LinkedList"));
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(Curso1);
		
		System.out.println(cursos.get(0).getAulaList());
	}
}
