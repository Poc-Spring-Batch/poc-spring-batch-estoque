package br.com.pupposoft.poc.springbatch.estoque.gateway.impl;

import org.springframework.stereotype.Component;

import br.com.pupposoft.poc.springbatch.config.db.entity.EstoqueEntity;
import br.com.pupposoft.poc.springbatch.config.db.repository.EstoqueRepository;
import br.com.pupposoft.poc.springbatch.estoque.domain.Estoque;
import br.com.pupposoft.poc.springbatch.estoque.exception.AcessoRepositorioDadosException;
import br.com.pupposoft.poc.springbatch.estoque.gateway.EstoqueGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class EstoqueRepositoryGateway implements EstoqueGateway {
	
	private final EstoqueRepository estoqueRepository;
	
	@Override
	public Estoque obterPorProdutoId(Long produtoId) {
		try {
			EstoqueEntity produtoEntity = estoqueRepository.findByProdutoId(produtoId);
			return produtoEntity.getEstoqueDomain();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new AcessoRepositorioDadosException();
		}
	}

	@Override
	public void salvar(Estoque estoque) {
		try {
			EstoqueEntity estoqueEntity = new EstoqueEntity(estoque);
			estoqueRepository.save(estoqueEntity);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new AcessoRepositorioDadosException();
		}
	}
}
