package br.com.yaman.quitanda.service;

import java.util.List;

public interface GenericService<T> {
	
	public List<T> findAll();
	public T save(T t);
	public T findOne(Integer id);
	public void delete(T t);

}
