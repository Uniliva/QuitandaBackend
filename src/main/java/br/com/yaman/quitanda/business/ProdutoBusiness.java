package br.com.yaman.quitanda.business;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.yaman.quitanda.dao.entity.Produto;
import br.com.yaman.quitanda.dao.entity.TipoProduto;
import br.com.yaman.quitanda.dto.ProdutoDTO;
import br.com.yaman.quitanda.dto.TipoProdutoDTO;
import br.com.yaman.quitanda.service.ProdutoService;

@Component
public class ProdutoBusiness implements GenericBusiness<ProdutoDTO> {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProdutoBusiness.class);

	@Autowired
	private ProdutoService service;

	@Override
	public List<ProdutoDTO> findAll() {
		List<Produto> produtos = service.findAll();
		LOGGER.info(" - findAll executado: "+produtos.size()+ " produtos retornados");
		return produtos.stream().map(p -> convertTODto(p)).collect(Collectors.toList());
	}

	@Override
	public ProdutoDTO save(ProdutoDTO p) {
		Produto produto = service.save(convertTOEntity(p));
		LOGGER.info(" - save executado: "+produto.getNome()+ " inserido");
		return convertTODto(produto);
	}

	@Override
	public ProdutoDTO findOne(Integer id) {
		Produto p = service.findOne(id);
		LOGGER.info(" - findOne executado: "+p.getNome()+ " Recuperado");
		return convertTODto(p);
	}

	@Override
	public void delete(ProdutoDTO p) {
		LOGGER.info(" - delete executado: "+p.getNome()+ " sendo deletado");
		service.delete(convertTOEntity(p));
	}

	private Produto convertTOEntity(ProdutoDTO dto) {
		if (dto == null)
			return null;

		TipoProdutoDTO tipoProdutoDTO = dto.getTipoProduto();

		TipoProduto tipoProduto;

		if (tipoProdutoDTO == null)
			tipoProduto = null;

		tipoProduto = new TipoProduto(dto.getTipoProduto().getId(), dto.getTipoProduto().getNome());

		Produto produto = new Produto(dto.getId(), dto.getNome(), tipoProduto, dto.getDescricao(), dto.getCalorias(),
				dto.getPesoMedio());
		return produto;
	}

	private ProdutoDTO convertTODto(Produto produto) {
		if (produto == null)
			return null;

		TipoProduto tipoProduto = produto.getTipoProduto();

		TipoProdutoDTO tipoProdutoDTO;

		if (tipoProduto == null)
			tipoProdutoDTO = null;

		tipoProdutoDTO = new TipoProdutoDTO(produto.getTipoProduto().getId(), produto.getTipoProduto().getNome());
		ProdutoDTO produtoDTO = new ProdutoDTO(produto.getId(), produto.getNome(), tipoProdutoDTO,
				produto.getDescricao(), produto.getCalorias(), produto.getPesoMedio());
		return produtoDTO;
	}

}
