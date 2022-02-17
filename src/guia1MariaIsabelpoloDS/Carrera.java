package guia1MariaIsabelpoloDS;

import java.util.Set;

public class Carrera {

    private String nombre;
    private Integer créditos;
    private Integer semestres;
    private Nivel nivel;
    private Facultad facultad;
    private Set<Curso> cursos;
	/**
	 * 
	 */
	public Carrera() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nombre
	 * @param créditos
	 * @param semestres
	 * @param nivel
	 * @param facultad
	 * @param cursos
	 */
	public Carrera(String nombre, Integer créditos, Integer semestres, Nivel nivel, Facultad facultad,
			Set<Curso> cursos) {
		super();
		this.nombre = nombre;
		this.créditos = créditos;
		this.semestres = semestres;
		this.nivel = nivel;
		this.facultad = facultad;
		this.cursos = cursos;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the créditos
	 */
	public Integer getCréditos() {
		return créditos;
	}
	/**
	 * @param créditos the créditos to set
	 */
	public void setCréditos(Integer créditos) {
		this.créditos = créditos;
	}
	/**
	 * @return the semestres
	 */
	public Integer getSemestres() {
		return semestres;
	}
	/**
	 * @param semestres the semestres to set
	 */
	public void setSemestres(Integer semestres) {
		this.semestres = semestres;
	}
	/**
	 * @return the nivel
	 */
	public Nivel getNivel() {
		return nivel;
	}
	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	/**
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}
	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	/**
	 * @return the cursos
	 */
	public Set<Curso> getCursos() {
		return cursos;
	}
	/**
	 * @param cursos the cursos to set
	 */
	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}
   
    
   
}