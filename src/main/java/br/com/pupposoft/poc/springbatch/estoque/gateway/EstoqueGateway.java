package br.com.pupposoft.poc.springbatch.estoque.gateway;

import br.com.pupposoft.poc.springbatch.estoque.domain.Estoque;

public interface EstoqueGateway {
	Estoque obterPorProdutoId(Long produtoId);

	void salvar(Estoque estoque);

}
