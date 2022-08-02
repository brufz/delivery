package com.acert.sistemadelivery.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_pedido")
public class PedidoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nomeRestaurante;
	@NotNull
	private String cnpjRestaurante;
	@NotNull
	private String enderecoRestaurante;
	@NotNull
	private String nomeProduto;
	@NotNull
	private double precoProduto;
	
	@ManyToOne
	@JsonIgnoreProperties("pedidos")
	private ClienteModel cliente;
	
	@OneToOne
	@JsonIgnoreProperties("pedidos")
	private EntregaModel entrega;
	
	public PedidoModel() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeRestaurante() {
		return nomeRestaurante;
	}
	public void setNomeRestaurante(String nomeRestaurante) {
		this.nomeRestaurante = nomeRestaurante;
	}
	public String getCnpjRestaurante() {
		return cnpjRestaurante;
	}
	public void setCnpjRestaurante(String cnpjRestaurante) {
		this.cnpjRestaurante = cnpjRestaurante;
	}
	public String getEnderecoRestaurante() {
		return enderecoRestaurante;
	}
	public void setEnderecoRestaurante(String enderecoRestaurante) {
		this.enderecoRestaurante = enderecoRestaurante;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}

	public EntregaModel getEntrega() {
		return entrega;
	}

	public void setEntrega(EntregaModel entrega) {
		this.entrega = entrega;
	}


	
	
	
	
	
}