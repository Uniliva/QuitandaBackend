package br.com.yaman.quitanda.business;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.yaman.quitanda.dao.entity.Produto;
import br.com.yaman.quitanda.dto.ProdutoDTO;
import br.com.yaman.quitanda.service.ProdutoService;

@Component
public class ProdutoBusiness implements GenericBusiness<ProdutoDTO> {

	@Autowired
	private ProdutoService service;
	
	@Autowired
	private ModelMapper modelMapper;
	
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
		return modelMapper.map(dto, Produto.class);
	}

	private ProdutoDTO convertTODto(Produto produto) {
		return modelMapper.map(produto, ProdutoDTO.class);
	}

}
