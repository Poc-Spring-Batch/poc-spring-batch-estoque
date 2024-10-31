package br.com.pupposoft.poc.springbatch.estoque.usecase;

import org.springframework.stereotype.Service;

import br.com.pupposoft.poc.springbatch.estoque.domain.Estoque;
import br.com.pupposoft.poc.springbatch.estoque.gateway.EstoqueGateway;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DecrementarEstoqueUseCase {
	
	private EstoqueGateway estoqueGateway;
	
	public void alterarPorProdutoId(Long produtoId, Integer quantidade) {
		
		Estoque estoque = estoqueGateway.obterPorProdutoId(produtoId);
		estoque.decrementar(quantidade);
		
		estoqueGateway.salvar(estoque);
	}

}
