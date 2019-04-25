package br.com.yaman.quitanda.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.yaman.quitanda.business.GenericBusiness;

@RestController
@RequestMapping
@CrossOrigin(allowedHeaders = "*")
public abstract class ResourceBase<T> {

	public abstract GenericBusiness<T> getBusinessClass();

	@GetMapping("/find-all")
	public ResponseEntity<List<T>> pageLoad() {
		List<T> lts = getBusinessClass().findAll();
		return ResponseEntity.ok(lts);
	}

	@PostMapping("/save")
	public ResponseEntity<T> save(@RequestBody T t) {
		T ts = getBusinessClass().save(t);
		return ResponseEntity.status(HttpStatus.CREATED).body(ts);
	}

	@GetMapping("/find-one") //.../find-one?id=abc
	public ResponseEntity<T> findOne(@RequestParam Integer id) {
		T tOne = getBusinessClass().findOne(id);
		return ResponseEntity.ok(tOne);
	}
	

	@PostMapping("/delete")
	public ResponseEntity<Void> delete(@RequestBody T t) {
		getBusinessClass().delete(t);
		return ResponseEntity.noContent().build();
	}

}
