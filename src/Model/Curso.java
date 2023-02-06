package Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Curso implements Comparable<Curso>{
	private String nombre;
	private int tiempo;
	private List<Aula> AulaList = new ArrayList<>();
	private Collection<Alumno> alumnos = new HashSet<>();
	//private Collection<Alumno> alumnos = new LinkedHashSet<>();
	private Map<String, Alumno> alumnoMap = new HashMap<>();
	
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
	
	//DE ESTA FORMA SE PUEDEN AGREGAR ALUMNOS DE DOS FORMAS, CON EL MAP Y EL ADD
	public void addAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
		this.alumnoMap.put(alumno.getCodigo(), alumno);
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

	public Map<String, Alumno> getAlumnoMap() {
		return alumnoMap;
	}

		
}
