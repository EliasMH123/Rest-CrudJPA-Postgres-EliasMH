package pe.edu.upeu.apirest2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idalumno;
	private String nombres;
	private String correo;
	private String telefono;
	
	public Alumno() {
	}

	public Alumno(String nombres, String correo, String telefono) {
		super();
		this.nombres = nombres;
		this.correo = correo;
		this.telefono = telefono;
	}

	public Long getIdalumno() {
		return idalumno;
	}

	public void setIdalumno(Long idalumno) {
		this.idalumno = idalumno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Alumno [idalumno=" + idalumno + ", nombres=" + nombres + ", correo=" + correo + ", telefono=" + telefono
				+ "]";
	}
	
	
}
