package Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Curso implements Comparable<Curso>{
	private String nombre;
	private int tiempo;
	private List<Aula> AulaList = new ArrayList<>();
	private Collection<Alumno> alumnos = new HashSet<>();
	
	public Curso(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public Curso(String nombre, int tiempo, List<Aula> claseList) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.AulaList = claseList;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public List<Aula> getAulaList() {
		return Collections.unmodifiableList(AulaList);
	}

	public void setAulaList(List<Aula> claseList) {
		this.AulaList = claseList;
	}
	
	public void addAula(Aula clase) {
		this.AulaList.add(clase);
	}
	
	public void addAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}
	
	public boolean verificaAlumno(Alumno alumno) {
		return this.alumnos.contains(alumno);
	}
	
	public Collection<Alumno> getAlumnos(){
		return alumnos;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}

	@Override
	public int compareTo(Curso o) {
		return 0;
	}

		
}
