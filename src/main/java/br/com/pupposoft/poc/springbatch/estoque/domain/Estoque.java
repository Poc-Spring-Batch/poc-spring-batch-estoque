package br.com.pupposoft.poc.springbatch.estoque.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Estoque {
	private final Long id;
	private final Long produtoId;
	private final Integer quantidade;
	private Integer quantidadeDecrementada;
	
	public void decrementar(Integer quantidade) {
		this.quantidadeDecrementada = quantidade;
	}
	
	public Integer getQuantidade() {
		return quantidade - quantidadeDecrementada;
	}
}
