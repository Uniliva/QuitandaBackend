package br.com.yaman.quitanda.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yaman.quitanda.business.GenericBusiness;
import br.com.yaman.quitanda.business.ProdutoBusiness;
import br.com.yaman.quitanda.dto.ProdutoDTO;

@RestController
@RequestMapping(value = "produto")
public class ProdutoController extends CrudControllerBase<ProdutoDTO> {
	
	@Autowired
	private ProdutoBusiness business;

	@Override
	public GenericBusiness<ProdutoDTO> getBusinessClass() {		
		return business;
	}

}
