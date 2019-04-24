package br.com.yaman.quitanda.business;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface GenericBusiness<T> {	
	public abstract List<T> findAll();
	public abstract T save(T t);
	public abstract T findOne(Integer id) ;
	public abstract void delete(T t);
}
