package guia1MariaIsabelpoloDS;

import java.sql.Date;

public class Producto {
  
    private String nombre;
    private Integer codigo;
    private String tipo;
    private Integer cantidad;
    private Date expiracion;
    private String Fabricante;
    private double precio;
    
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Date getExpiracion() {
		return expiracion;
	}
	public void setExpiracion(Date expiracion) {
		this.expiracion = expiracion;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

   
} 

