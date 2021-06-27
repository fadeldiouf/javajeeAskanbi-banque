package sn.askanbiBank.dao;

import java.util.List;

public interface Idao <T>{
	public void save (T t);
	public List<T> liste();
	public T update (T t);
	public void delete(Long id);

}
