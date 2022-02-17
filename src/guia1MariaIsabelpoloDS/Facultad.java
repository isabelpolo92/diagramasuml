package guia1MariaIsabelpoloDS;
import java.util.Set;

public class Facultad {
   
    private String nombre;
    private Integer profesores;
    private Integer estudiantes;
    private String carreras;
    private String cursos;
    private Set<Carrera> carrera;
    private Set<Profesor> profesor;
    private Universidad universidad;
	
    public Facultad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facultad(String nombre, Integer profesores, Integer estudiantes, String carreras, String cursos,
			Set<Carrera> carrera, Set<Profesor> profesor, Universidad universidad) {
		super();
		this.nombre = nombre;
		this.profesores = profesores;
		this.estudiantes = estudiantes;
		this.carreras = carreras;
		this.cursos = cursos;
		this.carrera = carrera;
		this.profesor = profesor;
		this.universidad = universidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getProfesores() {
		return profesores;
	}

	public void setProfesores(Integer profesores) {
		this.profesores = profesores;
	}

	public Integer getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Integer estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String getCarreras() {
		return carreras;
	}

	public void setCarreras(String carreras) {
		this.carreras = carreras;
	}

	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}

	public Set<Carrera> getCarrera() {
		return carrera;
	}

	public void setCarrera(Set<Carrera> carrera) {
		this.carrera = carrera;
	}

	public Set<Profesor> getProfesor() {
		return profesor;
	}

	public void setProfesor(Set<Profesor> profesor) {
		this.profesor = profesor;
	}

	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	} 
}
