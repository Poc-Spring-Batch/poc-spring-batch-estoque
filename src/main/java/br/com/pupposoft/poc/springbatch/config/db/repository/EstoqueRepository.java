package br.com.pupposoft.poc.springbatch.config.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pupposoft.poc.springbatch.config.db.entity.EstoqueEntity;


public interface EstoqueRepository extends JpaRepository<EstoqueEntity, Long> {

	EstoqueEntity findByProdutoId(Long produtoId);

}
