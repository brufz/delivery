package com.acert.sistemadelivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acert.sistemadelivery.model.PedidoModel;
import com.acert.sistemadelivery.repository.PedidoRepository;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
	@Autowired
	public PedidoRepository pedidoRepository;
	
	@GetMapping
	public ResponseEntity<List<PedidoModel>> getAll(){
		return ResponseEntity.ok(pedidoRepository.findAll());
	}
	
	@GetMapping("/nomeRestaurante/{nomeRestaurante}")
	public ResponseEntity <List<PedidoModel>> getByRestaurante(@PathVariable String nomeRestaurante){
		return ResponseEntity.ok(pedidoRepository.findAllByNomeRestauranteContainingIgnoreCase(nomeRestaurante));
	}
	
	@PostMapping
	public ResponseEntity <PedidoModel> post (@RequestBody PedidoModel pedido){
		return ResponseEntity.status(HttpStatus.CREATED).body(pedidoRepository.save(pedido));
	}
	
	@PutMapping
	public ResponseEntity<PedidoModel> put (@RequestBody PedidoModel pedido){
		return ResponseEntity.status(HttpStatus.OK).body(pedidoRepository.save(pedido));
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable Long id) {
		pedidoRepository.deleteById(id);
	}
	

}
