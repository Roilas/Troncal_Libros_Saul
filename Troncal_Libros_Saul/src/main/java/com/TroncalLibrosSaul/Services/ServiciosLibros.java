package com.TroncalLibrosSaul.Services;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.TroncalLibrosSaul.ClasesBasicas.Libro;


@Component
public class ServiciosLibros {

	@PersistenceContext
	private EntityManager MiGestorDeEntidades;

	public EntityManager getMiGestorDeEntidades() {
		return MiGestorDeEntidades;
	}

	public void setMiGestorDeEntidades(EntityManager GestorDeEntidadesIntroducido) {
		this.MiGestorDeEntidades = GestorDeEntidadesIntroducido;
	}
	
	
	
	@Transactional
	public void Registrar(Libro LibroIntroducido) {
		this.MiGestorDeEntidades.persist(LibroIntroducido);
	}
	
}
