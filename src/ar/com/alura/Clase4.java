package ar.com.alura;

import java.util.ArrayList;

import Model.Curso;

public class Clase4 {
	public static void main(String[] args) {
		
		Curso Curso1 = new Curso("Geometria", 30);
		Curso Curso2 = new Curso("Fisica", 20);
		Curso Curso3 = new Curso("Geografia", 10);
		Curso Curso4 = new Curso("Lengua", 40);
		Curso Curso5 = new Curso("Matematica", 50);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(Curso1);
		cursos.add(Curso2);
		cursos.add(Curso3);
		cursos.add(Curso4);
		cursos.add(Curso5);
		
		System.out.println(cursos);
	}
}
