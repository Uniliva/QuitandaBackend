package br.com.yaman.quitanda.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yaman.quitanda.dao.entity.Produto;
import br.com.yaman.quitanda.repository.ProdutoRepository;
import br.com.yaman.quitanda.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
    private ProdutoRepository repository;
	
	@Override
	public List<Produto> findAll() {
		return repository.findAll();
	}

	@Override
	public Produto save(Produto t) {
		return repository.save(t);
	}

	@Override
	public Produto findOne(Integer id) {
		return repository.findOne(id);
	}

	@Override
	public void delete(Produto t) {
		repository.delete(t);
	}

	@Override
	public Map<String, Integer> getSumProdutoByTipo() {
	  List<Produto> produtos = repository.findAll();
	  
	  Map<String, Integer> mapProdutos = new HashMap<String, Integer>();
	  
	   produtos.stream().collect(Collectors.groupingBy(p -> p.getTipoProduto().getNome())).forEach((k, v) -> mapProdutos.put(k,new Integer(v.size())));
	   
	   return mapProdutos;		
	}

}
