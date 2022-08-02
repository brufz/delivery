package com.acert.sistemadelivery.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_entrega")
public class EntregaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nomeEntregador;
	
	@NotNull
	private String meioTransporte;
	
	@OneToOne(mappedBy = "entrega", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("entrega")
	private PedidoModel pedidos;

	public EntregaModel() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeEntregador() {
		return nomeEntregador;
	}

	public void setNomeEntregador(String nomeEntregador) {
		this.nomeEntregador = nomeEntregador;
	}

	public String getMeioTransporte() {
		return meioTransporte;
	}

	public void setMeioTransporte(String meioTransporte) {
		this.meioTransporte = meioTransporte;
	}

	public PedidoModel getPedidos() {
		return pedidos;
	}

	public void setPedidos(PedidoModel pedidos) {
		this.pedidos = pedidos;
	}


	
	
	
	
	
}
