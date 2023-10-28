package domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Table(name = "Empleado")
@Entity(name = "Emple")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="nombres", length=100, nullable=false)
	private String nombres;
	@Column(name="apellidoPaterno", length=100, nullable=false)
	private String apellidoPaterno;
	@Column(name="apellidoMaterno", length=100, nullable=false)
	private String apellidoMaterno;
	@Column(name="numeroHijos", length=100, nullable=false)
	private Integer numeroHijos;
	@Column(name="sueldo", length=100, nullable=false)
	private double sueldo;
	@Transient
	private LocalDate fechaNacimiento;
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", numeroHijos=" + numeroHijos + ", sueldo=" + sueldo
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public Integer getNumeroHijos() {
		return numeroHijos;
	}
	public void setNumeroHijos(Integer numeroHijos) {
		this.numeroHijos = numeroHijos;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setFechaNacimiento(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
