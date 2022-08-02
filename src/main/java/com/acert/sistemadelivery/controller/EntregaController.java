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

import com.acert.sistemadelivery.model.EntregaModel;
import com.acert.sistemadelivery.repository.EntregaRepository;



@RestController
@RequestMapping("/entrega")
public class EntregaController {

	@Autowired
	public EntregaRepository entregaRepository;
	
	@GetMapping
	public ResponseEntity<List<EntregaModel>> getAll(){
		return ResponseEntity.ok(entregaRepository.findAll());
	}
	
	@GetMapping("/nomeEntregador/{nomeEntregador}")
	public ResponseEntity <List<EntregaModel>> getByRestaurante(@PathVariable String nomeRestaurante){
		return ResponseEntity.ok(entregaRepository.findAllByNomeEntregadorContainingIgnoreCase(nomeRestaurante));
	}
	
	@PostMapping
	public ResponseEntity <EntregaModel> post (@RequestBody EntregaModel entrega){
		return ResponseEntity.status(HttpStatus.CREATED).body(entregaRepository.save(entrega));
	}
	
	@PutMapping
	public ResponseEntity<EntregaModel> put (@RequestBody EntregaModel entrega){
		return ResponseEntity.status(HttpStatus.OK).body(entregaRepository.save(entrega));
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable Long id) {
		entregaRepository.deleteById(id);
	}
}
