package com.crud.ejemplo.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.ejemplo.restapi.entities.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
    
}
