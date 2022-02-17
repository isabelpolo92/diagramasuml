package guia1MariaIsabelpoloDS;

import java.util.Set;

public class Universidad {

    private String nombre;
    private String rector;
    private String ciudad;
    private Set<Facultad> facultades;
    private Set<Estudiante> estudiante;
	
    public Universidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Universidad(String nombre, String rector, String ciudad, Set<Facultad> facultades,
			Set<Estudiante> estudiante) {
		super();
		this.nombre = nombre;
		this.rector = rector;
		this.ciudad = ciudad;
		this.facultades = facultades;
		this.estudiante = estudiante;
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
	 * @return the rector
	 */
	public String getRector() {
		return rector;
	}

	/**
	 * @param rector the rector to set
	 */
	public void setRector(String rector) {
		this.rector = rector;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the facultades
	 */
	public Set<Facultad> getFacultades() {
		return facultades;
	}

	/**
	 * @param facultades the facultades to set
	 */
	public void setFacultades(Set<Facultad> facultades) {
		this.facultades = facultades;
	}

	/**
	 * @return the estudiante
	 */
	public Set<Estudiante> getEstudiante() {
		return estudiante;
	}

	/**
	 * @param estudiante the estudiante to set
	 */
	public void setEstudiante(Set<Estudiante> estudiante) {
		this.estudiante = estudiante;
	}  
}
