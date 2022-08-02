package com.acert.sistemadelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acert.sistemadelivery.model.EntregaModel;

@Repository
public interface EntregaRepository extends JpaRepository <EntregaModel, Long>{
	public List<EntregaModel> findAllByNomeEntregadorContainingIgnoreCase(String nomeEntregador);
}
