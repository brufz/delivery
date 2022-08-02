package com.acert.sistemadelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acert.sistemadelivery.model.PedidoModel;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoModel, Long>{
	public List<PedidoModel> findAllByNomeRestauranteContainingIgnoreCase(String nomeRestaurante);
}
