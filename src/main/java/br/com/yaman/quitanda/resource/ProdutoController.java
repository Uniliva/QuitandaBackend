package br.com.yaman.quitanda.resource;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yaman.quitanda.business.GenericBusiness;
import br.com.yaman.quitanda.business.ProdutoBusiness;
import br.com.yaman.quitanda.dto.ProdutoDTO;

@RestController
@RequestMapping(value = "produto")
@CrossOrigin(allowedHeaders = "*")
public class ProdutoController extends CrudControllerBase<ProdutoDTO> {
	
	@Autowired
	private ProdutoBusiness business;

	@Override
	public GenericBusiness<ProdutoDTO> getBusinessClass() {		
		return business;
	}
	
	@GetMapping("/total-por-tipo")
	public ResponseEntity<Map<String, Integer>> getSumProdutoByTipo() {
		Map<String, Integer> mp = business.getSumProdutoByTipo();
		return ResponseEntity.ok(mp);
	}

}
