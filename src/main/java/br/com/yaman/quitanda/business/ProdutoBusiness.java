package br.com.yaman.quitanda.business;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.yaman.quitanda.dao.entity.Produto;
import br.com.yaman.quitanda.dto.ProdutoDTO;
import br.com.yaman.quitanda.dto.TipoProdutoDTO;
import br.com.yaman.quitanda.service.ProdutoService;

@Component
public class ProdutoBusiness implements GenericBusiness<ProdutoDTO> {

	@Autowired
	private ProdutoService service;
	
	@Override
	public List<ProdutoDTO> findAll() {
		List<Produto> produtos = service.findAll();
		return produtos.stream().map(p -> convertTODto(p)).collect(Collectors.toList());
	}

	@Override
	public ProdutoDTO save(ProdutoDTO p) {
		Produto produto = service.save(convertTOEntity(p));
		return convertTODto(produto);
	}

	@Override
	public ProdutoDTO findOne(Integer id) {
		return convertTODto(service.findOne(id));
	}

	@Override
	public void delete(ProdutoDTO p) {
		service.delete(convertTOEntity(p));
	}
	
	private Produto convertTOEntity(ProdutoDTO dto) {
		
		return null;
	}

	private ProdutoDTO convertTODto(Produto produto) {
		TipoProdutoDTO  tipoProdutoDTO = new TipoProdutoDTO(produto.getTipoProduto().getId(), produto.getTipoProduto().getNome());
		ProdutoDTO produtoDTO = new ProdutoDTO(produto.getId(), produto.getNome(), tipoProdutoDTO, produto.getDescricao(), produto.getCalorias(), produto.getPesoMedio());
		return produtoDTO;
	}

}
