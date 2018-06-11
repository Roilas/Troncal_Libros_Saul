package com.TroncalLibrosSaul.prime.faces.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.TroncalLibrosSaul.ClasesBasicas.Libro;
import com.TroncalLibrosSaul.Services.ServiciosLibros;


//@ManagedProperty("#{employeeService}")
//private EmployeeService employeeService;
//
//private Employee employee = new Employee();
//

@ManagedBean
@SessionScoped
public class GestorLibros {
	
	
	@ManagedProperty("#{GestorLibros}")
	private ServiciosLibros OperacionesLibros;
	
	private Libro Libro = new Libro();
	
	public ServiciosLibros getOperacionesLibros() {
		return OperacionesLibros;
	}

	public void setOperacionesLibros(ServiciosLibros operacionesLibros) {
		OperacionesLibros = operacionesLibros;
	}

	public Libro getLibro() {
		return Libro;
	}

	public void setLibro(Libro libro) {
		Libro = libro;
	}

	
	public void Registrar() {
		
		
	System.out.println("Estas intentando registrar un libro");
	}
	
	
	

}
