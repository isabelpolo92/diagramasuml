package guia1MariaIsabelpoloDS;

import java.time.LocalDateTime;

public class Estudiante extends Persona {
    
    private LocalDateTime fechaIngreso;
    private String carrera;
    private Integer semestre;
    private Universidad universidad;
	/**
	 * 
	 */
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param fechaIngreso
	 * @param carrera
	 * @param semestre
	 * @param universidad
	 */
	public Estudiante(LocalDateTime fechaIngreso, String carrera, Integer semestre, Universidad universidad) {
		super();
		this.fechaIngreso = fechaIngreso;
		this.carrera = carrera;
		this.semestre = semestre;
		this.universidad = universidad;
	}
	/**
	 * @return the fechaIngreso
	 */
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	/**
	 * @return the carrera
	 */
	public String getCarrera() {
		return carrera;
	}
	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	/**
	 * @return the semestre
	 */
	public Integer getSemestre() {
		return semestre;
	}
	/**
	 * @param semestre the semestre to set
	 */
	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}
	/**
	 * @return the universidad
	 */
	public Universidad getUniversidad() {
		return universidad;
	}
	/**
	 * @param universidad the universidad to set
	 */
	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}   
}
