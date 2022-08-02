package com.acert.sistemadelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acert.sistemadelivery.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
	public List <ClienteModel> findAllByNomeClienteContainingIgnoreCase(String nomeCliente);
}
