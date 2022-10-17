package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Docente;

public interface DocenteRepository extends JpaRepository<Docente, Integer> {

	//JPQL
	//Query no con tablas sino con clases que tienen @Entity
	
     
	public List<Docente> listaDocentePorNombreDniUbigeo(String nombre, String dni, int idUbigeo, int estado, String fecInicio, String fecFin);
	
}


