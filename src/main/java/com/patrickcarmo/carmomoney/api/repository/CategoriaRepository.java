package com.patrickcarmo.carmomoney.api.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrickcarmo.carmomoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Serializable> {

}
