package com.bals;

/**
* Esta clase abstrae los posible datos de un profesor necesarios para un control de ellos
* @author Angel Balderas
* @version 0.0.1
*/
public class Profesor {
	
    //ATRIBUTOS
    private String nombre;		//Nombre del profesor
    private Integer clave;		//Clave de registro del profesor
    private Integer edad;		//Edad del profesor
    private String rfc;			//RFC del profesor
    private String telefono;	//Telefono de contacto del profesor
    
    //CONSTRUCTOR
    public Profesor() {
		setNombre("NULL");
		setClave(0);
		setEdad(0);
		setRfc("NULL");
		setTelefono("NULL");
	}
    
	public Profesor(
			Integer clave, String nombre,
			Integer edad, String rfc,
			String telefono
			) {
		this.nombre = nombre;
		this.clave = clave;
		this.edad = edad;
		this.rfc = rfc;
		this.telefono = telefono;
	}


	//SETTERS AND GETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getClave() {
		return clave;
	}

	public void setClave(Integer clave) {
		this.clave = clave;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Profesor: " + nombre +
				"; clave: " + clave +
				"; edad: " + edad +
				"; RFC: " + rfc +
				"; tel:" + telefono;
	}
    
	
}
