package br.com.yaman.quitanda.service;

import java.util.Map;

import br.com.yaman.quitanda.dao.entity.Produto;

public interface ProdutoService extends GenericService<Produto> {

	Map<String, Integer> getSumProdutoByTipo();
	
}
