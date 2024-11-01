package br.com.pupposoft.poc.springbatch.estoque.usecase;

import org.springframework.stereotype.Service;

import br.com.pupposoft.poc.springbatch.estoque.domain.Estoque;
import br.com.pupposoft.poc.springbatch.estoque.gateway.EstoqueGateway;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ObterEstoqueCarrinhoUseCase {
	
	private EstoqueGateway estoqueGateway;
	
	public Estoque obterPorProdutoId(Long produtoId) {
		return estoqueGateway.obterPorProdutoId(produtoId);
	}

}
