package com.patrickcarmo.carmomoney.api.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrickcarmo.carmomoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Serializable> {

}
