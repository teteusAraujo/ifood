package com.mateus.ifood.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Restaurante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private BigDecimal taxaFrete;
	private Boolean ativo;
	private Boolean aberto;
	private Date dataCadastro;
	private Date dataAtualização;

	public Restaurante(Long id, String nome, BigDecimal taxaFrete, Boolean ativo, Boolean aberto, Date dataCadastro,
			Date dataAtualização) {
		this.id = id;
		this.nome = nome;
		this.taxaFrete = taxaFrete;
		this.ativo = ativo;
		this.aberto = aberto;
		this.dataCadastro = dataCadastro;
		this.dataAtualização = dataAtualização;
	}

}
