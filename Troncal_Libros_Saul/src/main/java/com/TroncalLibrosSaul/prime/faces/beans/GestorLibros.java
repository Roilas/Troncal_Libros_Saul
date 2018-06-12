package com.TroncalLibrosSaul.prime.faces.beans;


import java.io.Serializable;
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
public class GestorLibros implements Serializable {
	
	
	@ManagedProperty("#{GestorLibros}")
	private ServiciosLibros OperacionesLibros;
	
	private Libro libro = new Libro();
	
	public ServiciosLibros getOperacionesLibros() {
		return OperacionesLibros;
	}

	public void setOperacionesLibros(ServiciosLibros operacionesLibros) {
		OperacionesLibros = operacionesLibros;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setlibro(Libro libro) {
		libro = libro;
	}

	
	public void Registrar() {
		
		
	System.out.println("Estas intentando registrar un libro");
	System.out.println("El libro introducido es " + libro.getTitulo() + ". Escrito por " + libro.getAutor() + " en " + libro.getFecha());
	}
	
	
	

}
