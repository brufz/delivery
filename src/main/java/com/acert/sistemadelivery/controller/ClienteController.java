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

import com.acert.sistemadelivery.model.ClienteModel;
import com.acert.sistemadelivery.repository.ClienteRepository;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	public ClienteRepository clienteRepository;
	
	@GetMapping
	public ResponseEntity<List<ClienteModel>> getAll(){
		return ResponseEntity.ok(clienteRepository.findAll());
	}
	
	@GetMapping("/nomeCliente/{nomeCliente}")
	public ResponseEntity <List<ClienteModel>> getByRestaurante(@PathVariable String nomeCliente){
		return ResponseEntity.ok(clienteRepository.findAllByNomeClienteContainingIgnoreCase(nomeCliente));
	}
	
	@PostMapping
	public ResponseEntity <ClienteModel> post (@RequestBody ClienteModel cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(cliente));
	}
	
	@PutMapping
	public ResponseEntity<ClienteModel> put (@RequestBody ClienteModel cliente){
		return ResponseEntity.status(HttpStatus.OK).body(clienteRepository.save(cliente));
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable Long id) {
		clienteRepository.deleteById(id);
	}

}
